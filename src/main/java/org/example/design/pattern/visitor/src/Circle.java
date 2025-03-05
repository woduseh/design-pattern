package org.example.design.pattern.visitor.src;

public record Circle(
	double radius
) implements Shape {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
