package org.example.design.pattern.adapter.src;

public class XmlToJsonAdapter {
    public String convertXmlToJson(String xml) {
        return xml.replace("<data>", "{").replace("</data>", "}")
                .replace("<item>", "\"item\": \"").replace("</item>", "\"");
    }
}
