package org.example.design.pattern.strategy.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WalkingRouteStrategy implements RouteStrategy {
	@Override
	public void buildRoute(String start, String end) {
		log.info("도보 경로를 계산합니다: {}에서 {}까지", start, end);
	}
}
