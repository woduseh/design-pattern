package org.example.design.pattern.mediator.src;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();

		Colleague colleague1 = new ConcreteColleague(mediator);
		Colleague colleague2 = new ConcreteColleague(mediator);
		Colleague colleague3 = new ConcreteColleague(mediator);

		mediator.addColleague(colleague1);
		mediator.addColleague(colleague2);
		mediator.addColleague(colleague3);

		colleague1.send("Hello, World!");
	}
}
