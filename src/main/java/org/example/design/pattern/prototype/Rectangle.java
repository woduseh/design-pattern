package org.example.design.pattern.prototype;

import lombok.Setter;

@Setter
public class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle(int x, int y, String color) {
		super(x, y, color);
	}

	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	public Rectangle clone() {
		return new Rectangle(this);
	}
}
