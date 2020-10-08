package introduction;

public class WrapperTest {

	public static void main(String[] args) {
		
		int n=7;
		Integer i=5; //boxing
		Integer m=5;
		n=m; //unboxing
		System.out.println(i==m);
	}

}
