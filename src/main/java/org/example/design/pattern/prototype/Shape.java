package org.example.design.pattern.prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {
	int x;
	int y;
	String color;

	public Shape(Shape shape) {
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;
	}

	public abstract Shape clone();
}
