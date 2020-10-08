package introduction;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		int num1 = 34, num2 = 34;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		num2 = sc.nextInt();
		
		//find maximum among two
		if(num1>num2)
			System.out.println(num1+" is grater than "+num2);
		else
			System.out.println(num2+" is grater than "+num1);;
	}

}
