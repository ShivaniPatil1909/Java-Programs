package introduction;

public class StringTest2 {

	public static void main(String[] args) {
		
		String s1= "Abhay & Suhas are friends";
		System.out.println("s1[5]: "+s1.charAt(5));
		
		String s2= s1.concat(" forever");
		System.out.println(s2);
		
		System.out.println(s1.indexOf(6));
		System.out.println(s1.indexOf("Suhas"));
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
