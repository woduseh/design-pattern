package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;
import org.example.design.pattern.factory.pizza.newyork.NewYorkCheeseOldPizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkClamOldPizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkPepperoniOldPizza;
import org.example.design.pattern.factory.pizza.newyork.NewYorkVeggieOldPizza;

public class NewYorkOldPizzaStore extends OldPizzaStore {
	public OldPizza createPizza(PizzaType type) {
		return switch (type) {
			case CHEESE -> new NewYorkCheeseOldPizza();
			case PEPPERONI -> new NewYorkPepperoniOldPizza();
			case CLAM -> new NewYorkClamOldPizza();
			case VEGGIE -> new NewYorkVeggieOldPizza();
		};
	}
}
