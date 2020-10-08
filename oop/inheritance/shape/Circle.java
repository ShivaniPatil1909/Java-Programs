package oop.inheritance.shape;

public class Circle extends Object implements Shape{

	double radius;
	
	public Circle(double radius) {
		//super();
		//Shape.PI = 22.0/7;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Shape.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Shape.PI*radius;
	}
	
}
