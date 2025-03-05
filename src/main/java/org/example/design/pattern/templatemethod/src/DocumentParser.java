package org.example.design.pattern.templatemethod.src;

public abstract class DocumentParser {
	// 템플릿 메서드
	public final void parseDocument(String filePath) {
		openFile(filePath);
		extractContent();
		parseContent();
		closeFile();
	}

	protected abstract void openFile(String filePath);
	protected abstract void extractContent();
	protected abstract void parseContent();
	protected abstract void closeFile();
}
