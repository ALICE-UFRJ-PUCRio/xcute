package br.uniriotec.xcute.web.form;

import java.util.List;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public class KipFormBean {

	public String nome;
	
	public List<KnowledgeIntensiveProcess> kips;

	public List<KnowledgeIntensiveProcess> getKips() {
		return kips;
	}

	public void setKips(List<KnowledgeIntensiveProcess> kips) {
		this.kips = kips;
	}
	@Override
	public String toString() {
		return "I am the KIP Form Bean";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
