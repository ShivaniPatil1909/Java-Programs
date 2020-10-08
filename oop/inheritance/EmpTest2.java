package oop.inheritance;

import java.util.*;

public class EmpTest2 {

	private static Scanner sc;
	
	private static Scanner getScanner()
	{
		if(sc == null)
			sc = new Scanner(System.in);
		return sc;
	}
	
	public static void main(String[] args) {
		Employee empList[];
		//how many employees
		empList= new Employee[5];
		
		for(int i=0; i<empList.length; i++)
		{
			//System.out.println("emplList["+i+"]= "+empList[i]);
			
			int choice= (int)(Math.random()*10);
			if(choice%2 ==0)
		
				empList[i] = createSalariedEmployee();
			else
				empList[i] = createHourlyPaidEmployee();
		}
		
		for(int i=0; i<empList.length; i++)
		{
			System.out.println(empList[i]);
		}
		
	}
	
	static SalariedEmployee createSalariedEmployee()
	{
		System.out.println("#### Creating Salaried Employee: #### ");
		String firstName, lastName;
		double basicSal;
		Scanner sc = getScanner();//new Scanner(System.in);
		
		System.out.println("Enter first Name");
		firstName= sc.next();
		
		System.out.println("Enter Last Name:");
		lastName= sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter Basic Salary: ");
		basicSal = sc.nextDouble();
		
		//sc.close();
		return new SalariedEmployee(firstName, lastName, basicSal);
	}
	
	static HourlyPaidEmployee createHourlyPaidEmployee()
	{

		System.out.println("####  Creating Hourly Paid Employee:  ####");
		String firstName, lastName;
		double HourlySal;
		int hoursWorked;
		Scanner sc = getScanner();//new Scanner(System.in);
		
		System.out.println("Enter first Name");
		
		firstName= sc.next();
		
		System.out.println("Enter Last Name:");
		lastName= sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter Hourly salary:");
		HourlySal = sc.nextDouble();
		
		System.out.println("Enter Hours worked:");
		hoursWorked = sc.nextInt();
		//sc.close();
		return new HourlyPaidEmployee(firstName, lastName, 
				HourlySal,hoursWorked);
	}


}
