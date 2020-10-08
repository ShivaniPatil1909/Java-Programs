package oop;

public class ParameterPassingTest2 {

	public static void main(String[] args) {
		Circle c1= new Circle(21);
		System.out.println("In Main(), for Circle c1");
		displayCircleInfo(c1);
		//changeCircle(c1);
		changeCircleInfo(c1);
		System.out.println("In Main(), for Circle c1");
		displayCircleInfo(c1);
		//changeCircleInfo(c1);
	}
	
	private static void changeCircleInfo(Circle c1) {
		c1.setRadius(12);
		System.out.println("In changeCirleInfo(), for Circle c1");
		displayCircleInfo(c1);
		
	}
	
	static void changeCircle(Circle c1)
	{
		c1 = new Circle(12);
		System.out.println("In changeCirle(), for Circle c1");
		displayCircleInfo(c1);
	}
	
	static void displayCircleInfo(Circle c1){
		System.out.println("   Radius: "+c1.getRadius());
		System.out.println("   Area  : "+c1.getArea());
		System.out.println("   Perimeter : "+c1.getPerimeter());
	
	}

}
