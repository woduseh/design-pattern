package org.example.design.pattern.factory.pizza.newyork;

public class NewYorkClamOldPizza extends NewYorkOldPizza {
	public NewYorkClamOldPizza() {
		this.name = "New York Style Clam Pizza";
		this.toppings.add("Fresh Clams from Long Island Sound");
		this.toppings.add("Grated Reggiano Cheese");
	}
}
