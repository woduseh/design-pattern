package org.example.design.pattern.state.src;

public class Document {
	private State state;
	private boolean isAdmin;

	public Document(boolean isAdmin) {
		this.state = new DraftState();
		this.isAdmin = isAdmin;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void publish() {
		state.publish(this);
	}

	public void render() {
		state.render(this);
	}
}
