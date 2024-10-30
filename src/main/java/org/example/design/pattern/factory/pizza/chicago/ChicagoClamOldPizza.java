package org.example.design.pattern.factory.pizza.chicago;

public class ChicagoClamOldPizza extends ChicagoOldPizza {
	public ChicagoClamOldPizza() {
		this.name = "Chicago Style Clam Pizza";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Frozen Clams");
	}
}
