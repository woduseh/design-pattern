package org.example.design.pattern.factory.abstractfactory;

import org.example.design.pattern.factory.abstractfactory.pizza.Pizza;
import org.example.design.pattern.factory.abstractfactory.store.ChicagoPizzaStore;
import org.example.design.pattern.factory.abstractfactory.store.NewYorkPizzaStore;
import org.example.design.pattern.factory.abstractfactory.store.PizzaStore;
import org.example.design.pattern.factory.factorymethod.ChicagoOldPizzaStore;
import org.example.design.pattern.factory.factorymethod.NewYorkOldPizzaStore;
import org.example.design.pattern.factory.factorymethod.OldPizzaStore;
import org.example.design.pattern.factory.pizza.OldPizza;
import org.example.design.pattern.factory.pizza.PizzaType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		Pizza newYorkCheesePizza = newYorkPizzaStore.orderPizza(PizzaType.CHEESE);

		Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza(PizzaType.PEPPERONI);

		log.info("Order From Ethan: {}", newYorkCheesePizza);
		log.info("Order From Joel: {}", chicagoPepperoniPizza);
	}
}