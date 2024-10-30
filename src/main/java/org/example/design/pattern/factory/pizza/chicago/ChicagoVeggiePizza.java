package org.example.design.pattern.factory.pizza.chicago;

public class ChicagoVeggiePizza extends ChicagoPizza {
	public ChicagoVeggiePizza() {
		this.name = "Chicago Style Veggie Pizza";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Black Olives");
		this.toppings.add("Spinach");
		this.toppings.add("Eggplant");
		this.toppings.add("Onions");
		this.toppings.add("Mushrooms");
		this.toppings.add("Red Pepper");
	}
}
