package org.example.design.pattern.visitor.src;

public interface Visitor {
	void visit(Circle circle);
	void visit(Rectangle rectangle);
	void visit(Triangle triangle);
}
