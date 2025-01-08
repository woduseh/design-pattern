package org.example.design.pattern.flyweight.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteFlyweight implements Flyweight {
	private final String intrinsicState;

	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String extrinsicState) {
		log.info("Intrinsic State: {}, Extrinsic State: {}", intrinsicState, extrinsicState);
	}
}
