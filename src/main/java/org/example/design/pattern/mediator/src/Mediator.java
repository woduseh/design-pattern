package org.example.design.pattern.mediator.src;

public interface Mediator {
	void sendMessage(String message, Colleague colleague);
	void addColleague(Colleague colleague);
}
