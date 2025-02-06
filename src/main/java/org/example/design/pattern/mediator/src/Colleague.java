package org.example.design.pattern.mediator.src;

public abstract class Colleague {
	protected Mediator mediator;

	protected Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message);
	public abstract void receive(String message);
}
