package org.example.design.pattern.command.src;

import lombok.Getter;

@Getter
public class Editor {
	private String text = "";

	public void appendText(String newText) {
		text += newText;
	}

	public void deleteText(int length) {
		if (length <= text.length()) {
			text = text.substring(0, text.length() - length);
		}
	}
}
