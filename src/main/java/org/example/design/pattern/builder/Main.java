package org.example.design.pattern.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		// 정원이 있는 집 생성
		Home gardenHome = new Home.Builder(4, 1, 4)
			.hasGarden(true)
			.build();

		// 수영장이 있는 집 생성
		Home swimPoolHome = new Home.Builder(4, 1, 4)
			.hasSwimPool(true)
			.build();

		log.info("정원이 있는 집: {}", gardenHome);
		log.info("수영장이 있는 집: {}", swimPoolHome);
	}
}