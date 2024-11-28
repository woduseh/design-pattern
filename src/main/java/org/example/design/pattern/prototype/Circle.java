package org.example.design.pattern.prototype;

import lombok.Setter;

@Setter
public class Circle extends Shape {
	int radius;

	public Circle(int x, int y, String color) {
		super(x, y, color);
	}

	public Circle(Circle circle) {
		super(circle);
		this.radius = circle.radius;
	}

	public Circle clone() {
		return new Circle(this);
	}
}
