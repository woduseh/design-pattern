package org.example.design.pattern.factory.pizza.newyork;

public class NewYorkVeggiePizza extends NewYorkPizza {
	public NewYorkVeggiePizza() {
		this.name = "New York Style Veggie Pizza";
		this.toppings.add("Shredded Mozzarella");
		this.toppings.add("Diced Onion");
		this.toppings.add("Sliced Mushrooms");
		this.toppings.add("Sliced Red Pepper");
		this.toppings.add("Sliced Black Olives");
		this.toppings.add("Sliced Spinach");
		this.toppings.add("Sliced Eggplant");
	}
}
