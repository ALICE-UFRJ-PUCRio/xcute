package br.uniriotec.xcute.busines.entity;

import java.util.Collection;

public class KnowledgeIntensiveProcess {
	
	private Integer id;
	
	private String nome;
	
	private Collection<KnowledgeIntensiveActivity> knowledgeIntensiveActivities;

	public KnowledgeIntensiveProcess() {
	}
	
	public KnowledgeIntensiveProcess(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<KnowledgeIntensiveActivity> getKnowledgeIntensiveActivities() {
		return knowledgeIntensiveActivities;
	}

	public void setKnowledgeIntensiveActivities(
			Collection<KnowledgeIntensiveActivity> knowledgeIntensiveActivities) {
		this.knowledgeIntensiveActivities = knowledgeIntensiveActivities;
	}
	

}
