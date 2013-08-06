package br.uniriotec.xcute.busines.entity;

import java.util.Collection;

public class ColaborationInfo {

	private Integer id;
	
	private String description;
	
	private String participationDescription;
	
	private String resourceType;
	
	private String agentName;
	
	private String type;
	
	private Boolean syncronous;
	
	private String specialityName;
	
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

	@Override
	public String toString() {
		return "ColaborationInfo ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (description != null ? "description=" + description + ", "
						: "")
				+ (participationDescription != null ? "participationDescription="
						+ participationDescription + ", "
						: "")
				+ (resourceType != null ? "resourceType=" + resourceType + ", "
						: "")
				+ (agentName != null ? "agentName=" + agentName + ", " : "")
				+ (type != null ? "type=" + type + ", " : "")
				+ (syncronous != null ? "syncronous=" + syncronous + ", " : "")
				+ (specialityName != null ? "specialityName=" + specialityName
						+ ", " : "")
				+ (participants != null ? "participants=" + participants : "")
				+ "]";
	}

	public String getParticipationDescription() {
		return participationDescription;
	}

	public void setParticipationDescription(String participationDescription) {
		this.participationDescription = participationDescription;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getSpecialityName() {
		return specialityName;
	}

	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	

	
	
}
