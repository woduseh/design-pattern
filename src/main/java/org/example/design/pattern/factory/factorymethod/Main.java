package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		OldPizzaStore nyOldPizzaStore = new NewYorkOldPizzaStore();
		OldPizzaStore chicagoOldPizzaStore = new ChicagoOldPizzaStore();

		OldPizza newYorkCheeseOldPizza = nyOldPizzaStore.orderPizza(PizzaType.CHEESE);

		OldPizza chicagoPepperoniOldPizza = chicagoOldPizzaStore.orderPizza(PizzaType.PEPPERONI);

		log.info("Order From Ethan: {}", newYorkCheeseOldPizza);
		log.info("Order From Joel: {}", chicagoPepperoniOldPizza);
	}
}