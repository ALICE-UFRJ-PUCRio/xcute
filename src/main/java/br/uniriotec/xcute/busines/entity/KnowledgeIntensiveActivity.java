package br.uniriotec.xcute.busines.entity;

public class KnowledgeIntensiveActivity {
	

	private Integer id;
	
	private String name;
	
	
	public KnowledgeIntensiveActivity() {
	}
	
	public KnowledgeIntensiveActivity(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
