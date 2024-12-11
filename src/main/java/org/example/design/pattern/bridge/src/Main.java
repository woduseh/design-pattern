package org.example.design.pattern.bridge.src;

public class Main {
    public static void main(String[] args) {
        Notification urgentEmail = new UrgentNotification(new EmailSender());
        Notification warningSms = new WarningNotification(new SmsSender());

        urgentEmail.notify("Server is down!");
        warningSms.notify("Disk space is low.");
    }
}
