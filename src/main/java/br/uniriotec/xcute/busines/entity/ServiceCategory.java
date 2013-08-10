package br.uniriotec.xcute.busines.entity;

public class ServiceCategory {

	private Integer id;
	
	private Integer parent;
	
	private String description;
	
	
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

	@Override
	public String toString() {
		return "ServiceCategory [" + (id != null ? "id=" + id + ", " : "")
				+ (parent != null ? "parent=" + parent + ", " : "")
				+ (description != null ? "description=" + description : "")
				+ "]";
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}
	

}
