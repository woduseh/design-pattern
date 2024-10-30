package org.example.design.pattern.factory.pizza.newyork;

public class NewYorkPepperoniOldPizza extends NewYorkOldPizza {
	public NewYorkPepperoniOldPizza() {
		this.name = "New York Style Pepperoni Pizza";
		this.toppings.add("Sliced Pepperoni");
		this.toppings.add("Grated Reggiano Cheese");
	}
}
