package oop.inheritance;

public class EmpTest3 {
	
static String firstName[]= {"Pradnya","Suraj","Devesh","Nakul","Smruti"};
	
	static String lastName[]= {"Kulkarni","Bandapatte","Hande","Aage","Birmal"};
	
	static double basicSal[]= {34000,12000,35000,60000,52000};
	
	static double hourlySal[]= {600,460,2000,400,500};
	
	static int hoursworked[]= {12,23,11,45,55};
	
	public static void main(String[] args) {
		Employee empList[];
		//how many employees
		empList= new Employee[5];
		
		for(int i=0; i<empList.length; i++)
		{
			//System.out.println("empList["+i+"]= "+empList[i]);
			
			int choice = (int)(Math.random()*10);
			
			//int index = choice/3;
			
			if (choice%2 ==0)
				empList[i]= new SalariedEmployee(firstName[i], lastName[i], basicSal[i]);
			
			else
				empList[i]= new HourlyPaidEmployee(firstName[i], lastName[i], hourlySal[i], hoursworked[i]);

			
		}
		
		System.out.println();
		
		for(int i=0; i<empList.length; i++)
		{
			System.out.println(empList[i]+", Salary: "+empList[i].getSalary());
			//System.out.println();
		}
		
	}


}
