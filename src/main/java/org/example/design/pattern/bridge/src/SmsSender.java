package org.example.design.pattern.bridge.src;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
