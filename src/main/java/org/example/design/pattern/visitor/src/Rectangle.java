package org.example.design.pattern.visitor.src;

public record Rectangle(
	double width,
	double height
) implements Shape {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
