package oop;

import java.util.Scanner;

public class CircleClient2 {

	public static void main(String[] args) {
		Circle c1, c2;
		c1 = null;
		
		c1 = new Circle(8);//create object of type circle
		
		System.out.println("c1.radius: "+c1.getRadius());
		//c1.setRadius(12);
		System.out.println("c1.radius: "+c1.getRadius());
		System.out.println("c1.area: "+c1.getArea());
		System.out.println("c1.perimeter: "+c1.getPerimeter());
		
		//Rectangle
		 Rectangle r1 = new Rectangle();
	}

}
