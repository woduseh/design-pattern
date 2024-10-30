package org.example.design.pattern.factory.pizza.newyork;

import org.example.design.pattern.factory.pizza.Pizza;

public abstract class NewYorkPizza extends Pizza {
	protected NewYorkPizza() {
		this.dough = "Thin Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}
}
