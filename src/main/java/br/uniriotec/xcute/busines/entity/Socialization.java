package br.uniriotec.xcute.busines.entity;

public class Socialization {

	private Integer id;
	
	private String name;
	
	private boolean colaborative;
	
	public Socialization() {
	}
	
	public Socialization(Integer id, String name) {
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

	public boolean isColaborative() {
		return colaborative;
	}

	public void setColaborative(boolean colaborative) {
		this.colaborative = colaborative;
	}

}
