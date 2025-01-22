package org.example.design.pattern.chainofresponsibility.src;

public class Client {
	public static void main(String[] args) {
		Handler authHandler = new AuthHandler();
		Handler loggingHandler = new LoggingHandler();
		Handler dataValidationHandler = new DataValidationHandler();

		authHandler.setNext(loggingHandler);
		loggingHandler.setNext(dataValidationHandler);

		Request request = new Request(true, true, "Sample request data");
		authHandler.handle(request);
	}
}
