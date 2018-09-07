package project.builder;

import java.util.Calendar;

import project.entities.Entity;
import project.entities.EntityItem;

public class EntityBuilderTwo {

	private Entity entity;

	public Entity build() {
		return entity;
	}
	
	public static EntityBuilderTwo oneEntity() {
		EntityBuilderTwo builder = new EntityBuilderTwo();
		builder.entity = new Entity();
		return builder;
	}

	public EntityBuilderTwo withIdentification(Integer identification) {
		entity.setIdentification(identification);
		return this;
	}

	public EntityBuilderTwo withName(String name) {
		entity.setName(name);
		return this;
	}

	public EntityBuilderTwo withRegisterDate(Calendar registerDate) {
		entity.setRegisterDate(registerDate);
		return this;
	}

	public EntityBuilderTwo withItem(EntityItem item) {
		entity.addItem(item);
		double total = entity.getTotal() + item.getValue();
		entity.setTotal(total);
		return this;
	}
}
