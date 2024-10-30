package org.example.design.pattern.factory.abstractfactory.store;

import org.example.design.pattern.factory.abstractfactory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public abstract class PizzaStore {
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(PizzaType type);
}
