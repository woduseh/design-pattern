package org.example.design.pattern.strategy.src;

import lombok.Setter;

@Setter
public class Navigator {
	private RouteStrategy routeStrategy;

	public void buildRoute(String start, String end) {
		routeStrategy.buildRoute(start, end);
	}
}
