package org.example.design.pattern.bridge.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
		log.info("Sending email: {}", message);
    }
}
