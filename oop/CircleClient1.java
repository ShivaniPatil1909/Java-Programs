package oop;

import java.util.Scanner;

public class CircleClient1 {

	public static void main(String[] args) {
		
		Circle c1, c2;
		c1= null;
		c1= new Circle( );
		System.out.println("c1.radius: "+c1.getRadius());
		c1.setRadius(12);
		System.out.println("c1.radius: "+c1.getRadius());
		
		System.out.println("c1.area: "+c1.getArea());
		System.out.println("c1.perimeter: "+c1.getPerimeter());
		
		// construct c2 & populate
		c2=null;
		c2= new Circle();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter radius of circle: ");
		
		double r= sc.nextDouble();
		c2.setRadius(r);
		
		System.out.println("c2.radius: "+c2.getRadius());
		System.out.println("c2.area: "+c2.getArea());
		System.out.println("c2.perimeter: "+c2.getPerimeter());

	}

}
