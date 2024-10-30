package org.example.design.pattern.factory.abstractfactory.pizza;

import org.example.design.pattern.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		this.name = PizzaType.CHEESE + " Pizza";
		log.info("Preparing {}", name);

		dough = pizzaIngredientFactory.createDough(PizzaType.CHEESE);
		sauce = pizzaIngredientFactory.createSauce(PizzaType.CHEESE);
		cheese = pizzaIngredientFactory.createCheese(PizzaType.CHEESE);
	}
}
