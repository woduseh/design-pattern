package org.example.design.pattern.decorator.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMSNotifier extends NotifierDecorator {
	public SMSNotifier(Notifier wrapped) {
		super(wrapped);
	}

	@Override
	public void send(String message) {
		super.send(message);
		log.info("Sending SMS: {}", message);
	}
}
