package org.example.design.pattern.chainofresponsibility.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataValidationHandler extends AbstractHandler {
	@Override
	public void handle(Request request) {
		if (request.isValid()) {
			log.info("Data validation successful");
			super.handle(request);
		} else {
			log.info("Data validation failed");
		}
	}
}
