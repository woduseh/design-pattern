package org.example.design.pattern.chainofresponsibility.src;

public interface Handler {
	void setNext(Handler handler);
	void handle(Request request);
}
