package org.example.design.pattern.composite.src;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Composite implements Component {
	private final String name;
	private final List<Component> components = new ArrayList<>();

	public Composite(String name) {
		this.name = name;
	}

	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void showPrice() {
		log.info(name);

		for (Component component : components) {
			component.showPrice();
		}
	}

	@Override
	public int getPrice() {
		return components.stream()
			.mapToInt(Component::getPrice)
			.sum();
	}
}
