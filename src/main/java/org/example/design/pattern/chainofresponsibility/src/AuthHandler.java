package org.example.design.pattern.chainofresponsibility.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthHandler extends AbstractHandler {
	@Override
	public void handle(Request request) {
		if (request.isAuthenticated()) {
			log.info("Authentication successful");
			super.handle(request);
		} else {
			log.info("Authentication failed");
		}
	}
}
