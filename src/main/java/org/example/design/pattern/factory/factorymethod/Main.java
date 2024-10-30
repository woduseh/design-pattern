package org.example.design.pattern.factory.factorymethod;

import org.example.design.pattern.factory.pizza.Pizza;
import org.example.design.pattern.factory.pizza.PizzaType;
import org.example.design.pattern.factory.simplefactory.SimplePizzaStore;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NewYorkPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		Pizza newYorkCheesePizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);

		Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza(PizzaType.PEPPERONI);

		log.info("Order From Ethan: {}", newYorkCheesePizza);
		log.info("Order From Joel: {}", chicagoPepperoniPizza);
	}
}