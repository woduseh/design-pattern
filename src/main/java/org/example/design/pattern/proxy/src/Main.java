package org.example.design.pattern.proxy.src;

public class Main {
	public static void main(String[] args) {
		Service service = new ProxyService();
		service.request();
	}
}
