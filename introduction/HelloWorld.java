package introduction;

public class HelloWorld {

	public static void main(String[] arg) {
		int b = 0;
		int i = -3 ;
		b = i<<1;
		System.out.println("b ="+b);
		b = i>>1;
		System.out.println("b ="+b);
		b = i>>>32;
		System.out.println("b ="+b);

	}
}
