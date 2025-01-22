package org.example.design.pattern.command.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	public static void main(String[] args) {
		Editor editor = new Editor();
		EditorInvoker invoker = new EditorInvoker();

		Command appendHello = new AppendTextCommand(editor, "Hello ");
		Command appendWorld = new AppendTextCommand(editor, "World!");

		invoker.executeCommand(appendHello);
		invoker.executeCommand(appendWorld);

		log.info("Current text: {}", editor.getText());

		invoker.undoCommand();
		log.info("After undo: {}", editor.getText());

		invoker.undoCommand();
		log.info("After second undo: {}", editor.getText());
	}
}
