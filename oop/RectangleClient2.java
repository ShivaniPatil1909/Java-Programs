package oop;

public class RectangleClient2 {

	public static void main(String[] args) {
		System.out.println("begin main()");
		Rectangle r1;
		System.out.println("After Rectangle variable declaration");
		r1= new Rectangle();
		System.out.println("After creating Rectangle object ");
		r1.setBreadth(12);
		r1.setLength(20);
		displyRectangle(r1);
		//another rectangle
		Rectangle r2 = new Rectangle(33,13);
		System.out.println();
		displyRectangle(r2);
		
	}
	
	static void displyRectangle(Rectangle r)
	{
		System.out.println("length = "+r.getLength()
 			+", breadth= "+r.getBreadth());
		double area = r.getArea();
		double perimeter = r.getPerimeter();
		System.out.println("Area="+area);
		System.out.println("Perimeter= "+perimeter);
	}


}
