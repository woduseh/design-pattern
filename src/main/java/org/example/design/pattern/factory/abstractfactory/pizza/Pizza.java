package org.example.design.pattern.factory.abstractfactory.pizza;

import org.example.design.pattern.factory.abstractfactory.ingredient.cheese.Cheese;
import org.example.design.pattern.factory.abstractfactory.ingredient.clam.Clam;
import org.example.design.pattern.factory.abstractfactory.ingredient.dough.Dough;
import org.example.design.pattern.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.example.design.pattern.factory.abstractfactory.ingredient.sause.Sauce;
import org.example.design.pattern.factory.abstractfactory.ingredient.veggies.Veggies;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;

	public abstract void prepare();

	public void bake(){
		log.info("Bake for 25 minutes at 350");
	}

	public void cut(){
		log.info("Cutting the pizza into diagonal slices");
	}

	public void box(){
		log.info("Place pizza in official PizzaStore box");
	}
}
