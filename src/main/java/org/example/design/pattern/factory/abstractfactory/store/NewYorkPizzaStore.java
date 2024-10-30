package org.example.design.pattern.factory.abstractfactory.store;

import org.example.design.pattern.factory.abstractfactory.ingredientfactory.NewYorkPizzaIngredientFactory;
import org.example.design.pattern.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import org.example.design.pattern.factory.abstractfactory.pizza.CheesePizza;
import org.example.design.pattern.factory.abstractfactory.pizza.ClamPizza;
import org.example.design.pattern.factory.abstractfactory.pizza.PepperoniPizza;
import org.example.design.pattern.factory.abstractfactory.pizza.Pizza;
import org.example.design.pattern.factory.abstractfactory.pizza.VeggiesPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

public class NewYorkPizzaStore extends PizzaStore {
	protected Pizza createPizza(PizzaType pizzaType) {
		PizzaIngredientFactory pizzaIngredientFactory = new NewYorkPizzaIngredientFactory();

		return switch (pizzaType) {
			case CHEESE -> new CheesePizza(pizzaIngredientFactory);
			case CLAM ->  new ClamPizza(pizzaIngredientFactory);
			case VEGGIE -> new VeggiesPizza(pizzaIngredientFactory);
			case PEPPERONI -> new PepperoniPizza(pizzaIngredientFactory);
		};
	}
}
