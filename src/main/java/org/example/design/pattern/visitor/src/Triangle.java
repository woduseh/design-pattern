package org.example.design.pattern.visitor.src;

public record Triangle(
	double base,
	double height
) implements Shape {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
