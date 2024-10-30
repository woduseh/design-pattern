package org.example.design.pattern.factory.pizza.chicago;

public class ChicagoPepperoniOldPizza extends ChicagoOldPizza {
	public ChicagoPepperoniOldPizza() {
		this.name = "Chicago Style Pepperoni Pizza";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Black Olives");
		this.toppings.add("Spinach");
		this.toppings.add("Eggplant");
		this.toppings.add("Sliced Pepperoni");
	}
}
