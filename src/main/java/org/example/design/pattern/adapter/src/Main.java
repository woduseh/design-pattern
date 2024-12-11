package org.example.design.pattern.adapter.src;

public class Main {
	public static void main(String[] args) {
		XmlDataProvider xmlDataProvider = new XmlDataProvider();
		XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter();
		JsonDataProcessor jsonDataProcessor = new JsonDataProcessor();

		String xmlData = xmlDataProvider.provideXmlData();

		String jsonData = xmlToJsonAdapter.convertXmlToJson(xmlData);

		jsonDataProcessor.processJson(jsonData);
	}
}
