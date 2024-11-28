package org.example.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

import org.example.design.pattern.builder.Home;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<>();

		Circle circle = new Circle(1, 2, "red");
		circle.setRadius(3);
		shapeList.add(circle);

		Rectangle rectangle = new Rectangle(3, 4, "blue");
		rectangle.setWidth(5);
		rectangle.setHeight(6);
		shapeList.add(rectangle);

		cloneAndPrintShapes(shapeList);
	}

	private static void cloneAndPrintShapes(List<Shape> shapeList) {
		List<Shape> clonedShapeList = new ArrayList<>();
		for (Shape shape : shapeList) {
			clonedShapeList.add(shape.clone());
		}
		printShapes(clonedShapeList);
	}

	private static void printShapes(List<Shape> shapeList) {
		for (Shape shape : shapeList) {
			log.info("Shape: x={}, y={}, color={}", shape.x, shape.y, shape.color);
		}
	}
}