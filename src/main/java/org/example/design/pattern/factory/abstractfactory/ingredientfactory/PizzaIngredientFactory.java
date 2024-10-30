package org.example.design.pattern.factory.abstractfactory.ingredientfactory;

import org.example.design.pattern.factory.abstractfactory.ingredient.cheese.Cheese;
import org.example.design.pattern.factory.abstractfactory.ingredient.clam.Clam;
import org.example.design.pattern.factory.abstractfactory.ingredient.dough.Dough;
import org.example.design.pattern.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.example.design.pattern.factory.abstractfactory.ingredient.sause.Sauce;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Veggies;
import org.example.design.pattern.factory.pizza.PizzaType;

public abstract class PizzaIngredientFactory {
	public abstract Dough createDough(PizzaType pizzaType);
	public abstract Sauce createSauce(PizzaType pizzaType);
	public abstract Cheese createCheese(PizzaType pizzaType);
	public abstract Veggies[] createVeggies(PizzaType pizzaType);
	public abstract Pepperoni createPepperoni(PizzaType pizzaType);
	public abstract Clam createClam(PizzaType pizzaType);
}
