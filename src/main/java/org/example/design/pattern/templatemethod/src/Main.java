package org.example.design.pattern.templatemethod.src;

public class Main {
	public static void main(String[] args) {
		DocumentParser docParser = new DocParser();
		docParser.parseDocument("example.doc");

		DocumentParser pdfParser = new PdfParser();
		pdfParser.parseDocument("example.pdf");
	}
}
