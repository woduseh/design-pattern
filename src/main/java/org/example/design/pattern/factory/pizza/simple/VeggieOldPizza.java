package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.OldPizza;

public class VeggieOldPizza extends OldPizza {
	public VeggieOldPizza() {
		this.name = "Veggie Pizza";
		this.dough = "Crust";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Shredded mozzarella");
		this.toppings.add("Grated parmesan");
		this.toppings.add("Diced onion");
		this.toppings.add("Sliced mushrooms");
		this.toppings.add("Sliced red pepper");
		this.toppings.add("Sliced black olives");
	}
}
