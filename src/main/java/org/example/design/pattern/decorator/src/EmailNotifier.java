package org.example.design.pattern.decorator.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotifier implements Notifier {
	@Override
	public void send(String message) {
		log.info("Sending email: {}", message);
	}
}
