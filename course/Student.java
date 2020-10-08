package course;

import java.util.*;

public class Student {
	
	int rollno;
	int sub[];
	int count_of_sub_reg;
	static int max_count=5;
	Scanner sc=new Scanner (System.in);
	Subject s1[]=new Subject[5];
	
	public void add_student()
	{
		int code;
		String title;
		System.out.println("Enter the roll no. of the student: ");
		rollno=sc.nextInt();
		System.out.println("Enter the no of subjects: ");
		count_of_sub_reg=sc.nextInt();
		
		if(count_of_sub_reg<=max_count) 
		{
			for(int i=1; i<count_of_sub_reg; i++)
			{
				System.out.println("Enter the subject code and title:");
				code=sc.nextInt();
				title=sc.next();
				s1[i].set(code,title);
			}
		}
		
		
	}
	
	

}
