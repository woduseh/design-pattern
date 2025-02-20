package org.example.design.pattern.state.src;

public class Main {
	public static void main(String[] args) {
		Document document = new Document(false);
		document.render();
		document.publish();
		document.render();

		Document adminDocument = new Document(true);
		adminDocument.publish();
		adminDocument.render();
	}
}
