package org.example.design.pattern.factory.pizza.chicago;

public class ChicagoClamPizza extends ChicagoPizza {
	public ChicagoClamPizza() {
		this.name = "Chicago Style Clam Pizza";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Frozen Clams");
	}
}
