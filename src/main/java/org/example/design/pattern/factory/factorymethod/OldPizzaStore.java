package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public abstract class OldPizzaStore {
	public OldPizza orderPizza(PizzaType type) {
		OldPizza oldPizza = createPizza(type);

		oldPizza.prepare();
		oldPizza.bake();
		oldPizza.cut();
		oldPizza.box();

		return oldPizza;
	}

	abstract OldPizza createPizza(PizzaType type);
}
