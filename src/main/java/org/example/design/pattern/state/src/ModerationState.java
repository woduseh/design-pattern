package org.example.design.pattern.state.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModerationState implements State {
	@Override
	public void publish(Document document) {
		if (document.isAdmin()) {
			document.setState(new PublishedState());
			log.info("Document is now Published.");
		} else {
			log.info("Only admins can publish the document.");
		}
	}

	@Override
	public void render(Document document) {
		log.info("Rendering document in Moderation state.");
	}
}
