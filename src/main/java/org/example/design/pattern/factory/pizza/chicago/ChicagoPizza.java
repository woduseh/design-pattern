package org.example.design.pattern.factory.pizza.chicago;

import org.example.design.pattern.factory.pizza.Pizza;

public abstract class ChicagoPizza extends Pizza {
	protected ChicagoPizza() {
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}
}
