package introduction;

public class StringTest {

	public static void main(String[] args) {
		
		String s1 ="Abhay";
		String s2 = new String("Abhay");
		String s3 ="Abhay";
		String s4 = new String("Abhay");
		
		int a=3 ;
		int b=3;
		 System.out.println(" a==b : "+(a==b));
		 System.out.println(" s1==s2 : "+(s1==s2));
		 System.out.println(" s1==s3 : "+(s1==s3));
		 System.out.println(" s2==s4 : "+(s2==s4));
	}

}
