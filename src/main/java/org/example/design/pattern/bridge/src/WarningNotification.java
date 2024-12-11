package org.example.design.pattern.bridge.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WarningNotification extends Notification {
    public WarningNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        log.info("Warning: ");
        sender.send(message);
    }
}
