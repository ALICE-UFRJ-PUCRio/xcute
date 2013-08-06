package br.uniriotec.xcute.busines.entity;

import java.util.Collection;

public class ColaborationInfo {

	private Integer id;
	
	private String description;
	
	private String type;
	
	private Boolean syncronous;
	
	private Collection<Participant> participants;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSyncronous() {
		return syncronous;
	}

	public void setSyncronous(Boolean syncronous) {
		this.syncronous = syncronous;
	}

	public Collection<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Collection<Participant> participants) {
		this.participants = participants;
	}
	

	
	
}
