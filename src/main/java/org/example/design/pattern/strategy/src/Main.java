package org.example.design.pattern.strategy.src;

public class Main {
	public static void main(String[] args) {
		Navigator navigator = new Navigator();

		navigator.setRouteStrategy(new CarRouteStrategy());
		navigator.buildRoute("서울", "부산");

		navigator.setRouteStrategy(new WalkingRouteStrategy());
		navigator.buildRoute("서울", "부산");

		navigator.setRouteStrategy(new PublicTransportRouteStrategy());
		navigator.buildRoute("서울", "부산");
	}
}
