package org.example.design.pattern.proxy.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealService implements Service {
	@Override
	public void request() {
		log.info("RealService: Handling request.");
	}
}
