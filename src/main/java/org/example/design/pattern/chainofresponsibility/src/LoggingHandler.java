package org.example.design.pattern.chainofresponsibility.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingHandler extends AbstractHandler {
	@Override
	public void handle(Request request) {
		log.info("Logging request: {}", request.getData());
		super.handle(request);
	}
}
