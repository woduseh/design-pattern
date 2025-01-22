package org.example.design.pattern.command.src;

public class AppendTextCommand implements Command {
	private final Editor editor;
	private final String textToAppend;

	public AppendTextCommand(Editor editor, String textToAppend) {
		this.editor = editor;
		this.textToAppend = textToAppend;
	}

	@Override
	public void execute() {
		editor.appendText(textToAppend);
	}

	@Override
	public void undo() {
		editor.deleteText(textToAppend.length());
	}
}
