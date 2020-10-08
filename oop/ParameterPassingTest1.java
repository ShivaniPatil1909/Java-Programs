package oop;

public class ParameterPassingTest1 {

	public static void main(String[] args) {
		int m,n;
		m=23;
		n=56;
		System.out.println("in main");
		System.out.println("   m= "+m+",   n= "+n );
		swap(m,n);
		
		System.out.println("in main(), after swap() invocation");
		System.out.println("   m= "+m+",   n= "+n );
	}
	
	static void swap(int a, int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("in swap()");
		System.out.println("   m= "+a+",   n= "+b );
	}

}
