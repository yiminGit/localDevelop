package com.test.design.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
		rect.draw();
		
		Square square = (Square) ShapeFactory.getClass(Square.class);
		square.draw();
		
		Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
		circle.draw();
	}

}
