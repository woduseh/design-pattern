package org.example.design.pattern.mediator.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteColleague extends Colleague {
	public ConcreteColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		log.info("Sending message: {}", message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		log.info("Received message: {}", message);
	}
}
