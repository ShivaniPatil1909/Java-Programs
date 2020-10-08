package oop;

public class Rectangle {
	private double length, breadth;
	
	public Rectangle()
	{
		System.out.println("default constructor");
	}
	
	

	public Rectangle(double length, double breadth) {
	//	super();
		System.out.println("in prametrised constructor");
		this.length = length;
		this.breadth = breadth;
	}



	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}	
	
	public double getArea(){
		return length*breadth;
	}
	
    public double getPerimeter(){
		return 2*(this.length+breadth);
	}
}
