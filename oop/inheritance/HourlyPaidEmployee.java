package oop.inheritance;

public class HourlyPaidEmployee extends Employee {

	private double hourlySalary;
	private int hoursworked;
	public HourlyPaidEmployee(String firstName, String lastName) {
		super(firstName, lastName);
		
	}

	public HourlyPaidEmployee(String firstName, String lastName, double hourlySalary, int hoursworked) {
		super(firstName, lastName);
		this.hourlySalary = hourlySalary;
		this.hoursworked = hoursworked;
	}

	
	public double getHourlySalary() {
		return hourlySalary;
	}

	
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	
	public int getHoursworked() {
		return hoursworked;
	}

	
	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}

	@Override
	public double getSalary() {
		return hourlySalary * hoursworked;
	}

	@Override
	public String toString() 
	{
		return super.toString()+" , Hourly Salary : "+hourlySalary+" , Hours worked: "+hoursworked;
		
	}


}
