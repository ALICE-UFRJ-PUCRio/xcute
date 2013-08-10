package br.uniriotec.xcute.busines.entity;

public class ComunicationInfo {

	private Integer activityId;

	private String activityName;
	
	private Integer kiaAgentId;

	private Integer comunicationAgentId;
	
	private String comunicationAgentName;

	private String cardinality;
	
	private String language;

	public ComunicationInfo() {
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCardinality() {
		return cardinality;
	}

	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}

	public Integer getKiaAgentId() {
		return kiaAgentId;
	}

	public void setKiaAgentId(Integer kiaAgentId) {
		this.kiaAgentId = kiaAgentId;
	}

	public Integer getComunicationAgentId() {
		return comunicationAgentId;
	}

	public void setComunicationAgentId(Integer comunicationAgentId) {
		this.comunicationAgentId = comunicationAgentId;
	}

	public String getComunicationAgentName() {
		return comunicationAgentName;
	}

	public void setComunicationAgentName(String comunicationAgentName) {
		this.comunicationAgentName = comunicationAgentName;
	}
	
	

	@Override
	public String toString() {
		return "ComunicationInfo ["
				+ (activityId != null ? "activityId=" + activityId + ", " : "")
				+ (activityName != null ? "activityName=" + activityName + ", "
						: "")
				+ (kiaAgentId != null ? "kiaAgentId=" + kiaAgentId + ", " : "")
				+ (comunicationAgentId != null ? "comunicationAgentId="
						+ comunicationAgentId + ", " : "")
				+ (comunicationAgentName != null ? "comunicationAgentName="
						+ comunicationAgentName + ", " : "")
				+ (cardinality != null ? "cardinality=" + cardinality + ", "
						: "")
				+ (language != null ? "language=" + language : "") + "]";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
