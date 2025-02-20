package org.example.design.pattern.state.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DraftState implements State {
	@Override
	public void publish(Document document) {
		document.setState(new ModerationState());
		log.info("Document is now in Moderation state.");
	}

	@Override
	public void render(Document document) {
		log.info("Rendering document in Draft state.");
	}
}
