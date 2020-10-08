package oop;

import java.util.Scanner;

public class RectangleClient {

	public static void main(String[] args) {
		System.out.println("begin main()");
		Rectangle r1;
		System.out.println("After Rectangle variable declaration");
		r1= new Rectangle();
		System.out.println("After creating Rectangle object ");
		r1.setBreadth(12);
		r1.setLength(20);
		
		System.out.println("length = "+r1.getLength()
		 		+", breadth= "+r1.getBreadth());
		double area = r1.getArea();
		double perimeter = r1.getPerimeter();
		System.out.println("Area="+area);
		System.out.println("Perimeter= "+perimeter);
		
		//another rectangle
		Rectangle r2 = new Rectangle(33,13);
	}
	
	static void displyRectangle(Rectangle r)
	{
		
	}

}
