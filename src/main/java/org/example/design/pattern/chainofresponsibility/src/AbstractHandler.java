package org.example.design.pattern.chainofresponsibility.src;

public abstract class AbstractHandler implements Handler {
	private Handler nextHandler;

	@Override
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}

	@Override
	public void handle(Request request) {
		if (nextHandler != null) {
			nextHandler.handle(request);
		}
	}
}
