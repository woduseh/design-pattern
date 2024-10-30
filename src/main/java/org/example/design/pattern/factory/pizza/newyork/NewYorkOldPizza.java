package org.example.design.pattern.factory.pizza.newyork;

import org.example.design.pattern.factory.pizza.OldPizza;

public abstract class NewYorkOldPizza extends OldPizza {
	protected NewYorkOldPizza() {
		this.dough = "Thin Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}
}
