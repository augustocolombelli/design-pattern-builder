package project.entities;

public class EntityItem {

	private Integer number;
	private String name;
	private Double value;

	public EntityItem(Integer number, String name, Double value) {
		this.number = number;
		this.name = name;
		this.value = value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
