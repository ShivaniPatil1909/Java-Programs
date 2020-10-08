package Array;

import java.util.Scanner;

public class SortString {
		
	public static void main(String[] args) {
		String temp;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many names you want to enter: ");
		int N= sc.nextInt();
		sc.nextLine();
		
		String names[] = new String[N];
		
		System.out.println("Enter "+N+" Names: ");
		for(int i=0; i<N; i++)
		{
			System.out.println(+(i+1));
			names[i] = sc.nextLine();
		}
		
		for(int i=0; i<N; i++)
		{
			for(int j=i+1; j<N; j++)
			{
				if(names[i].compareTo( names[j] ) > 0)
				{
					temp = names[i];
					names[i] = names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("\n Sorted names in ascending order: ");
		for(int i=0; i<N; i++)
		{
			System.out.println( names[i] );
		}

	}

}
