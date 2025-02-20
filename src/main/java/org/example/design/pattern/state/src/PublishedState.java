package org.example.design.pattern.state.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PublishedState implements State {
	@Override
	public void publish(Document document) {
		log.info("Document is already published.");
	}

	@Override
	public void render(Document document) {
		log.info("Rendering document in Published state.");
	}
}