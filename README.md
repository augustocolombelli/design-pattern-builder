### Builder Design Pattern
Simple example using Builder Design Pattern.

#### How this Design Pattern can help us?
Using this pattern, we can create classes responsible for creating other classes that have some complexity. For example, it is very useful in unit testing when you need to instantiate many objects with many attributes. You can create cleaner unit tests.

#### Two ways to create Builders
In our example, we create two Builders, EntityBuilderOne and EntityBuilderTwo. The objective of this Builder is the same, but we have some differences in the format that objects are created. 

In the first way, we have all of attributes in the class Builder. It is necessary to set his values in a method. In our example, we are doing this in the method build().

```
public class EntityBuilderOne {

 private int identification;
 private double total;
 //...
 public Entity build() {
   Entity entity = new Entity();
   entity.setIdentification(identification);
   //...
   return entity;
 }

 public EntityBuilderOne withIdentification(Integer identification) {
   this.identification = identification;
   return this;
 }
//...
}
```

In the second way, we have only one reference to the Entity and we define the values directly in the method that is needed at the moment. The method that is responsible for creating an Entity instance is static and must always be invoked.

```
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
	//...
}
```
