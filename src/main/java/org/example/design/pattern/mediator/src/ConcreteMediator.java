package org.example.design.pattern.mediator.src;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	private final List<Colleague> colleagues;

	public ConcreteMediator() {
		this.colleagues = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, Colleague colleague) {
		for (Colleague c : colleagues) {
			if (c != colleague) {
				c.receive(message);
			}
		}
	}

	@Override
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}
}
