package br.uniriotec.xcute.busines.entity;

import java.util.Collection;

public class KnowledgeIntensiveProcess {
	
	private Integer id;
	
	private String process;
	
	private Collection<KnowledgeIntensiveActivity> knowledgeIntensiveActivities;

	public KnowledgeIntensiveProcess() {
	}
	
	public KnowledgeIntensiveProcess(Integer id, String process) {
		super();
		this.id = id;
		this.process = process;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Collection<KnowledgeIntensiveActivity> getKnowledgeIntensiveActivities() {
		return knowledgeIntensiveActivities;
	}

	public void setKnowledgeIntensiveActivities(
			Collection<KnowledgeIntensiveActivity> knowledgeIntensiveActivities) {
		this.knowledgeIntensiveActivities = knowledgeIntensiveActivities;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
	

}
