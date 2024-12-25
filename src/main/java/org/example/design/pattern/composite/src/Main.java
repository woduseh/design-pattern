package org.example.design.pattern.composite.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		Component hardDrive = new Leaf("Hard Drive", 4000);
		Component mouse = new Leaf("Mouse", 500);
		Component monitor = new Leaf("Monitor", 8000);
		Component cpu = new Leaf("CPU", 15000);

		Composite peripheral = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite computer = new Composite("Computer");

		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);

		cabinet.addComponent(hardDrive);
		cabinet.addComponent(cpu);

		computer.addComponent(peripheral);
		computer.addComponent(cabinet);

		computer.showPrice();
		log.info("Total Price: {}", computer.getPrice());
	}
}
