package collection.begin;

public class BoxTest2 {
	public static void main(String[] args) {
		Box b1= new Box();
		b1.putData(12.67);
		double d = (Double)b1.getData();
		System.out.println("Data in box: "+d);
		
		Box b2= new Box();
		b2.putData("I am String");
		String d1 = (String)b2.getData();
		System.out.println("Data in box: "+d1);
		
	}
}
