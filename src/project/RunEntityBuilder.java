package project;

import java.util.Calendar;

import project.builder.EntityBuilderOne;
import project.builder.EntityBuilderTwo;
import project.entities.Entity;
import project.entities.EntityItem;

public class RunEntityBuilder {

	public static void main(String[] args) {
		runTestWithBuilderOne();
		runTestWithBuilderTwo();
	}
	
	private static void runTestWithBuilderOne() {
		Entity entityOne = new EntityBuilderOne()
				.withIdentification(100)
				.withName("Entity One")
				.withRegisterDate(Calendar.getInstance())
				.withItem(new EntityItem(1, "Item 1", 100.0))
				.withItem(new EntityItem(2, "Item 2", 50.0))
				.withItem(new EntityItem(3, "Item 3", 10.0))
				.build();
		
		System.out.println("Name: " + entityOne.getName());
		System.out.println("Total: " + entityOne.getTotal());
		System.out.println("Number of items: " + entityOne.getItems().size());
	}
	
	private static void runTestWithBuilderTwo() {
		Entity entityTwo = EntityBuilderTwo
				.oneEntity()
				.withIdentification(100)
				.withName("Entity Two")
				.withRegisterDate(Calendar.getInstance())
				.withItem(new EntityItem(1, "Item 1", 100.0))
				.withItem(new EntityItem(2, "Item 2", 50.0))
				.withItem(new EntityItem(3, "Item 3", 30.0))
				.build();
		
		System.out.println("Name: " + entityTwo.getName());
		System.out.println("Total: " + entityTwo.getTotal());
		System.out.println("Number of items: " + entityTwo.getItems().size());
	}
	
}
