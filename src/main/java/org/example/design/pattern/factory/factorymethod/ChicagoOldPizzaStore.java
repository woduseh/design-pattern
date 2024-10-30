package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.chicago.ChicagoCheeseOldPizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoClamOldPizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoPepperoniOldPizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoVeggieOldPizza;
import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public class ChicagoOldPizzaStore extends OldPizzaStore {
	public OldPizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new ChicagoCheeseOldPizza();
			case PEPPERONI -> new ChicagoPepperoniOldPizza();
			case CLAM -> new ChicagoClamOldPizza();
			case VEGGIE -> new ChicagoVeggieOldPizza();
		};
	}
}
