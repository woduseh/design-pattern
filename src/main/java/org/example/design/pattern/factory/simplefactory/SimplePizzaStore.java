package org.example.design.pattern.factory.simplefactory;

import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public class SimplePizzaStore {
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = SimplePizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
