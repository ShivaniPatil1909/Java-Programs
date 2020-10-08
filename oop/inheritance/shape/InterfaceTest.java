package oop.inheritance.shape;

public class InterfaceTest {
	
	static public void main(String []args)
	{
		Circle c1 = new Circle(12);
		System.out.println(c1.getArea());
		Shape s1 = c1;
		System.out.println("Perimeter: "+s1.getPerimeter());
		
	}



}
