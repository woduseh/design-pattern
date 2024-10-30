package org.example.design.pattern.factory.abstractfactory.pizza;

import org.example.design.pattern.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClamPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		this.name = PizzaType.CLAM + " Pizza";
		log.info("Preparing {}", name);

		dough = pizzaIngredientFactory.createDough(PizzaType.CLAM);
		sauce = pizzaIngredientFactory.createSauce(PizzaType.CLAM);
		cheese = pizzaIngredientFactory.createCheese(PizzaType.CLAM);
		clam = pizzaIngredientFactory.createClam(PizzaType.CLAM);
	}
}
