package org.example.design.pattern.decorator.src;

public class Main {
	public static void main(String[] args) {
		Notifier notifier = new EmailNotifier();
		notifier = new SMSNotifier(notifier);
		notifier = new SlackNotifier(notifier);

		notifier.send("Hello, World!");
	}
}
