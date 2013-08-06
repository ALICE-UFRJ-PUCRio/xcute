package br.uniriotec.xcute.busines.persistence.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public class KipProcessDataBaseMock {

	private  Map<Integer, Collection<KnowledgeIntensiveActivity>> MEMORY_ACTIVITY_DB; 
	
	private  List<KnowledgeIntensiveProcess> MEMORY_KIPS_DB;
	{
		MEMORY_ACTIVITY_DB = new HashMap<Integer, Collection<KnowledgeIntensiveActivity>>();
		MEMORY_KIPS_DB = new ArrayList<KnowledgeIntensiveProcess>();
		initActivity();
		initKIP();
	}
	
	public  List<KnowledgeIntensiveProcess> listInMemory() {
		return MEMORY_KIPS_DB; 
	}

	private  Collection<KnowledgeIntensiveActivity> listActivityInMemory(int i) {
		return MEMORY_ACTIVITY_DB.get(i);
	}

	//loading databases
	
	/** Loading Activitys */
	private void initActivity() {
		Collection<KnowledgeIntensiveActivity> act1 = new ArrayList<KnowledgeIntensiveActivity>();
		int i = 0;
		act1.add(new KnowledgeIntensiveActivity(++i, "Definir objetivo"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Adiquirir conhecimento do neg�cio"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Coletar requisitos de stakeholders"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Discutir requisito"));
		
		act1.add(new KnowledgeIntensiveActivity(++i, "Realizar entrevista"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Realizar din�micas de grupo"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Realizar oficinas"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Brainstorming"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Discutir requisito"));
		
		act1.add(new KnowledgeIntensiveActivity(++i, "Aplicar question�rio"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Priorizar requisito"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Realizar acordo de requisitos"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Conduzir Entrevista"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Simular Cen�rio"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Realizar observa��o e an�lise social"));
		act1.add(new KnowledgeIntensiveActivity(++i, "Desenvolver prot�tipo"));
		MEMORY_ACTIVITY_DB.put(1, act1); 
	}
	
	
	/** Loading KIPS */
	private void initKIP(){
		int i = 0;
		KnowledgeIntensiveProcess e = new KnowledgeIntensiveProcess(++i, "Levantamento de Requisitos");
		e.setKnowledgeIntensiveActivities(listActivityInMemory(1));
		MEMORY_KIPS_DB.add(e); 
		KnowledgeIntensiveProcess f = new KnowledgeIntensiveProcess(++i, "Desenvolvimento de Produto Novo");
		MEMORY_KIPS_DB.add(f);
		KnowledgeIntensiveProcess g = new KnowledgeIntensiveProcess(++i, "Gerenciamento de Conformidade Regulamentar");
		MEMORY_KIPS_DB.add(g);
		KnowledgeIntensiveProcess h = new KnowledgeIntensiveProcess(++i, "Relat�rios de Falhas e Resolu��o de Defeitoso");
		MEMORY_KIPS_DB.add(h);
	} 
	
}
