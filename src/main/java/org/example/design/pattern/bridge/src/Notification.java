package org.example.design.pattern.bridge.src;

public abstract class Notification {
    protected NotificationSender sender;

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notify(String message);
}
