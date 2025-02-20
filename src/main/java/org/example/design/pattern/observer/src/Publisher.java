package org.example.design.pattern.observer.src;

public interface Publisher {
	void registerSubscriber(Subscriber subscriber);
	void removeSubscriber(Subscriber subscriber);
	void notifySubscribers();
}
