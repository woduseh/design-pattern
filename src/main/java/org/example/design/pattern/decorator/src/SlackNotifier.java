package org.example.design.pattern.decorator.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SlackNotifier extends NotifierDecorator {
	public SlackNotifier(Notifier wrapped) {
		super(wrapped);
	}

	@Override
	public void send(String message) {
		super.send(message);
		log.info("Sending Slack message: {}", message);
	}
}
