package org.example.design.pattern.factory.abstractfactory.pizza;

import org.example.design.pattern.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VeggiesPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public VeggiesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		this.name = PizzaType.VEGGIE + " Pizza";
		log.info("Preparing {}", name);

		dough = pizzaIngredientFactory.createDough(PizzaType.VEGGIE);
		sauce = pizzaIngredientFactory.createSauce(PizzaType.VEGGIE);
		cheese = pizzaIngredientFactory.createCheese(PizzaType.VEGGIE);
		veggies = pizzaIngredientFactory.createVeggies(PizzaType.VEGGIE);
	}
}
