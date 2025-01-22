package org.example.design.pattern.command.src;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorInvoker {
	private final Deque<Command> commandHistory = new ArrayDeque<>();

	public void executeCommand(Command command) {
		command.execute();
		commandHistory.push(command);
	}

	public void undoCommand() {
		if (!commandHistory.isEmpty()) {
			Command command = commandHistory.pop();
			command.undo();
		}
	}
}
