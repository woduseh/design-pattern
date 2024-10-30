package org.example.design.pattern.factory.abstractfactory.pizza;

import org.example.design.pattern.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		this.name = PizzaType.PEPPERONI + " Pizza";
		log.info("Preparing {}", name);

		dough = pizzaIngredientFactory.createDough(PizzaType.PEPPERONI);
		sauce = pizzaIngredientFactory.createSauce(PizzaType.PEPPERONI);
		cheese = pizzaIngredientFactory.createCheese(PizzaType.PEPPERONI);
		pepperoni = pizzaIngredientFactory.createPepperoni(PizzaType.PEPPERONI);
		veggies = pizzaIngredientFactory.createVeggies(PizzaType.PEPPERONI);
	}
}
