package oop;

public class Circle {

	private double radius;
	
	//constructor 
	public Circle(){
		System.out.println("in constructor: Circle()");
	}
	
	//constructor 
	public Circle(double r)
	{
		radius = r;
		System.out.println("in Constructor: Circle(double)");
	}
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)         
	{
		radius = r;
	}
	
	public double getArea()
	{
	   return 3.14*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 22.0/7*2*radius;
	}
	
	void m1()
	{
		
	}
	
	void m1(int n)
	{
		
	}
}
