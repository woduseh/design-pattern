package org.example.design.pattern.factory.abstractfactory.ingredientfactory;

import org.example.design.pattern.factory.abstractfactory.ingredient.cheese.Cheese;
import org.example.design.pattern.factory.abstractfactory.ingredient.cheese.MozzarellaCheese;
import org.example.design.pattern.factory.abstractfactory.ingredient.clam.Clam;
import org.example.design.pattern.factory.abstractfactory.ingredient.clam.FrozenClam;
import org.example.design.pattern.factory.abstractfactory.ingredient.dough.Dough;
import org.example.design.pattern.factory.abstractfactory.ingredient.dough.ThickCrustDough;
import org.example.design.pattern.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.example.design.pattern.factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import org.example.design.pattern.factory.abstractfactory.ingredient.sause.PlumTomatoSauce;
import org.example.design.pattern.factory.abstractfactory.ingredient.sause.Sauce;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.BlackOlives;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Eggplant;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Mushrooms;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Onion;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.RedPepper;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Spinach;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Veggies;
import org.example.design.pattern.factory.pizza.PizzaType;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
	@Override
	public Dough createDough(PizzaType pizzaType) {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce(PizzaType pizzaType) {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese(PizzaType pizzaType) {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies(PizzaType pizzaType) {
		return switch (pizzaType) {
			case PEPPERONI ->  new Veggies[] {new BlackOlives(), new Spinach(), new Eggplant()};
			case VEGGIE ->  new Veggies[] {new Onion(), new Mushrooms(), new RedPepper(), new BlackOlives(), new Spinach(), new Eggplant()};
			default -> throw new IllegalArgumentException("Unsupported pizzaType: " + pizzaType);
		};
	}

	@Override
	public Pepperoni createPepperoni(PizzaType pizzaType) {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam(PizzaType pizzaType) {
		return new FrozenClam();
	}
}
