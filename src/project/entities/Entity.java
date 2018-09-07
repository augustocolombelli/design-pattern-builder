package project.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Entity {

	private int identification;
	private String name;
	private double total;
	private Calendar registerDate;
	private List<EntityItem> items;

	public Entity() {
		items = new ArrayList<EntityItem>();
	}

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Calendar registerDate) {
		this.registerDate = registerDate;
	}

	public List<EntityItem> getItems() {
		return items;
	}

	public void setItems(List<EntityItem> items) {
		this.items = items;
	}
	
	public void addItem(EntityItem item) {
		items.add(item);
	}

}
