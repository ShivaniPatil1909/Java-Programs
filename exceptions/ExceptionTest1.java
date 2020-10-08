package exceptions;

import java.util.*;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int m= 12, n =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of m and n: ");
		
		m = sc.nextInt();
		n = sc.nextInt();
		try{
			int d = m/n;
			
			System.out.println(m+"/"+n+" = "+d);
			
			for(int i=0; i<4 ; i++)
				System.out.println("args["+i+"]"+args[i]);
		}catch(ArithmeticException e){
			System.out.println("/ by Zero ");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is not in range");
		}
		
		System.out.println("End main()");
	}


}
