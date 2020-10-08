package introduction;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("\n Temperature in celcius: ");
		float c= sc.nextFloat();
		
		float f= (c * 9/5)+32;
		
		System.out.println("\n Temperature in fahrenheit = "+f);
	}

}
