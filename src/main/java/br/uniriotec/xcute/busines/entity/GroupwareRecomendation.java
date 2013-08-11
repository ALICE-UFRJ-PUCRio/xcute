package br.uniriotec.xcute.busines.entity;

public class GroupwareRecomendation implements Comparable<GroupwareRecomendation>{

	private Integer id;
	
	private String serviceName;
	
	private String description;
	
	private Integer idServiceCategory;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdServiceCategory() {
		return idServiceCategory;
	}

	public void setIdServiceCategory(Integer idServiceCategory) {
		this.idServiceCategory = idServiceCategory;
	}

	@Override
	public String toString() {
		return "GroupwareRecomendation ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (serviceName != null ? "serviceName=" + serviceName + ", "
						: "")
				+ (description != null ? "description=" + description + ", "
						: "")
				+ (idServiceCategory != null ? "idServiceCategory="
						+ idServiceCategory : "") + "]";
	}

	
	@Override
	public int compareTo(GroupwareRecomendation o) {
		return this.serviceName.compareTo(o.serviceName);
	}
	
}
