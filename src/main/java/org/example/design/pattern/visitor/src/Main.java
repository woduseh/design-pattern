package org.example.design.pattern.visitor.src;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
			new Circle(5),
			new Rectangle(4, 6),
			new Triangle(3, 7)
		};

		Visitor areaCalculator = new AreaCalculator();

		for (Shape shape : shapes) {
			shape.accept(areaCalculator);
		}
	}
}
