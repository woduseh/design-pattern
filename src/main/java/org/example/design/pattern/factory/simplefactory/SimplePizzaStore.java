package org.example.design.pattern.factory.simplefactory;

import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public class SimplePizzaStore {
	public OldPizza orderPizza(PizzaType type) {
		OldPizza oldPizza = SimplePizzaFactory.createPizza(type);

		oldPizza.prepare();
		oldPizza.bake();
		oldPizza.cut();
		oldPizza.box();

		return oldPizza;
	}
}
