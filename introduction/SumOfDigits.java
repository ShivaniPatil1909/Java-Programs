package introduction;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String args[]){
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		do{
		  n= sc.nextInt();
		}while(n<0);
		
		while(n>0){
			int r  = n %10;
			sum+=r;
			n/=10;
		}
		System.out.println("sum of digits of "+n+" is :"+sum);
	}
}
