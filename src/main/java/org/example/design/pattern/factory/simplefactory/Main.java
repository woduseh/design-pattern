package org.example.design.pattern.factory.simplefactory;

import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		SimplePizzaStore simplePizzaStore = new SimplePizzaStore();

		Pizza pizza = simplePizzaStore.orderPizza(PizzaType.CHEESE);

		log.info("Here is your pizza: {}", pizza);
	}
}