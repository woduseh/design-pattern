package org.example.design.pattern.bridge.src;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
