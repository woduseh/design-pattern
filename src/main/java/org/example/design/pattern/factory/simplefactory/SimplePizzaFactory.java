package org.example.design.pattern.factory.simplefactory;

import org.example.design.pattern.factory.pizza.simple.CheeseOldPizza;
import org.example.design.pattern.factory.pizza.simple.ClamOldPizza;
import org.example.design.pattern.factory.pizza.simple.PepperoniOldPizza;
import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;
import org.example.design.pattern.factory.pizza.simple.VeggieOldPizza;

public class SimplePizzaFactory {
	private SimplePizzaFactory() {}

	public static OldPizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new CheeseOldPizza();
			case PEPPERONI -> new PepperoniOldPizza();
			case CLAM -> new ClamOldPizza();
			case VEGGIE -> new VeggieOldPizza();
		};
	}
}
