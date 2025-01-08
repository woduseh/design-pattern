package org.example.design.pattern.proxy.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyService implements Service {
	private RealService realService;

	@Override
	public void request() {
		if (realService == null) {
			realService = new RealService();
		}

		log.info("ProxyService: Delegating request to RealService.");

		realService.request();
	}
}
