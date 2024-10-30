package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.chicago.ChicagoCheesePizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoClamPizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoPepperoniPizza;
import org.example.design.pattern.factory.pizza.chicago.ChicagoVeggiePizza;
import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new ChicagoCheesePizza();
			case PEPPERONI -> new ChicagoPepperoniPizza();
			case CLAM -> new ChicagoClamPizza();
			case VEGGIE -> new ChicagoVeggiePizza();
		};
	}
}
