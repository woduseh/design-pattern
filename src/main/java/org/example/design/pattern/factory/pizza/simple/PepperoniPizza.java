package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.Pizza;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		this.name = "Pepperoni Pizza";
		this.dough = "Thick Crust";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Sliced Pepperoni");
		this.toppings.add("Onions");
		this.toppings.add("Mushrooms");
		this.toppings.add("Red Pepper");
	}
}
