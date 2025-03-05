package org.example.design.pattern.visitor.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AreaCalculator implements Visitor {
	@Override
	public void visit(Circle circle) {
		double area = Math.PI * circle.radius() * circle.radius();
		log.info("Circle area: {}", area);
	}

	@Override
	public void visit(Rectangle rectangle) {
		double area = rectangle.width() * rectangle.height();
		log.info("Rectangle area: {}", area);
	}

	@Override
	public void visit(Triangle triangle) {
		double area = 0.5 * triangle.base() * triangle.height();
		log.info("Triangle area: {}", area);
	}
}
