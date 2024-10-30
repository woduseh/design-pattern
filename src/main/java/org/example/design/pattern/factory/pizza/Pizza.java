package org.example.design.pattern.factory.pizza;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<>();

	public void prepare(){
		log.info("Preparing pizza {}", name);
		log.info("Tossing dough...");
		log.info("Adding sauce...");
		log.info("Adding toppings: ");
		for (String topping : toppings) {
			log.info("{} ", topping);
		}
	}

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
