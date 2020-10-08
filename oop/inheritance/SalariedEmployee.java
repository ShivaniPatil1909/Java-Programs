package oop.inheritance;

public class SalariedEmployee extends Employee {
	
	private double basicSal;
	static double HRA=30, DA=90;
	public SalariedEmployee(String firstName, String lastName, double bSal)
	{
		super(firstName, lastName);
		System.out.println("in salaried employee");
		this.basicSal= bSal;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+basicSal;
	}
	
	

}
