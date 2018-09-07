package project.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import project.entities.Entity;
import project.entities.EntityItem;

public class EntityBuilderOne {

	private int identification;
	private double total;
	private String name;
	private Calendar registerDate;
	private List<EntityItem> items = new ArrayList<EntityItem>();
	
	public EntityBuilderOne() {
		this.registerDate = Calendar.getInstance();
	}
	
	public Entity build() {
		Entity entity = new Entity();
		entity.setIdentification(identification);
		entity.setName(name);
		entity.setRegisterDate(registerDate);
		entity.setItems(items);
		entity.setTotal(total);
		return entity;
	}

	public EntityBuilderOne withIdentification(Integer identification) {
		this.identification = identification;
		return this;
	}

	public EntityBuilderOne withName(String name) {
		this.name = name;
		return this;
	}

	public EntityBuilderOne withRegisterDate(Calendar registerDate) {
		this.registerDate = registerDate;
		return this;
	}
	
	public EntityBuilderOne withItem(EntityItem item) {
		items.add(item);
		total += item.getValue();
		return this;
	}

}
