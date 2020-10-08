package introduction;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		double nums[];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements: ");
		n = sc.nextInt();
		//creating array dynamically 
		nums = new double[n];
		
		//display defaults values of array elements
		for(int i=0; i<nums.length; i++)
			System.out.println("nums["+i+"]= "+nums[i]);

		
		System.out.println("Enter "+n +" numbers: ");
		for(int i=0; i<nums.length; i++)
			nums[i]=sc.nextDouble();
		
		System.out.println("Array Elemnsts are: ");
		
		//Using for-each loop to get elements of an array
		for(double d: nums)
			System.out.println(d);
		
		nums=new double[4];
		for(double d: nums)
			System.out.println(d);
		
	}

}
