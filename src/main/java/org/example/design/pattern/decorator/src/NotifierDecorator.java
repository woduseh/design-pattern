package org.example.design.pattern.decorator.src;

public abstract class NotifierDecorator implements Notifier {
	protected Notifier wrapped;

	protected NotifierDecorator(Notifier wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public void send(String message) {
		wrapped.send(message);
	}
}
