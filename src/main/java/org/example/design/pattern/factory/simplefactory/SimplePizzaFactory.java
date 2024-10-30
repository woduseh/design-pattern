package org.example.design.pattern.factory.simplefactory;

import org.example.design.pattern.factory.pizza.simple.CheesePizza;
import org.example.design.pattern.factory.pizza.simple.ClamPizza;
import org.example.design.pattern.factory.pizza.simple.PepperoniPizza;
import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;
import org.example.design.pattern.factory.pizza.simple.VeggiePizza;

public class SimplePizzaFactory {
	private SimplePizzaFactory() {}

	public static Pizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new CheesePizza();
			case PEPPERONI -> new PepperoniPizza();
			case CLAM -> new ClamPizza();
			case VEGGIE -> new VeggiePizza();
		};
	}
}
