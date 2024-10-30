package org.example.design.pattern.factory.pizza.chicago;

import org.example.design.pattern.factory.pizza.OldPizza;

public abstract class ChicagoOldPizza extends OldPizza {
	protected ChicagoOldPizza() {
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}
}
