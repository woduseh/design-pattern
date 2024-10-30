package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;
import org.example.design.pattern.factory.pizza.newyork.NewYorkCheesePizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkClamPizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkPepperoniPizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkVeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {
	public Pizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new NewYorkCheesePizza();
			case PEPPERONI -> new NewYorkPepperoniPizza();
			case CLAM -> new NewYorkClamPizza();
			case VEGGIE -> new NewYorkVeggiePizza();
		};
	}
}
