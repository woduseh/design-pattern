package org.example.design.pattern.bridge.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UrgentNotification extends Notification {
    public UrgentNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        log.info("Urgent: ");
        sender.send(message);
    }
}
