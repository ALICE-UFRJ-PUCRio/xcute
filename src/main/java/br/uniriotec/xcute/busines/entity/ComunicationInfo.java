package br.uniriotec.xcute.busines.entity;

public class ComunicationInfo {

	private Integer activityId;

	private String activityName;
	
	private Integer kiaAgentId;

	private Integer comunicationAgentId;
	
	private String comunicationAgentName;

	private String cardinality;

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
				+ "\n"+ (activityId != null ? "activityId=" + activityId + ", " : "")
				+ "\n"+ (activityName != null ? "activityName=" + activityName + ", "
						: "")
				+ "\n"+ (kiaAgentId != null ? "kiaAgentId=" + kiaAgentId + ", " : "")
				+ "\n"+ (comunicationAgentId != null ? "comunicationAgentId="
						+ comunicationAgentId + ", " : "")
				+ "\n"+ (comunicationAgentName != null ? "comunicationAgentName="
						+ comunicationAgentName + ", " : "")
				+ "\n"+ (cardinality != null ? "cardinality=" + cardinality : "")
				+ "]";
	}
	
}
