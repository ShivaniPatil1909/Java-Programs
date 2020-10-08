package oop.inheritance;

public class Employee {
	protected long id;
	protected String firstName, lastName;

	private static long idseed=0;

	public Employee (String firstName, String lastName) {
		//super();
		this.id=NewId();
		this.firstName=firstName;
		this.lastName=lastName;		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private long NewId() {
		return ++idseed;
		
	}

	@Override
	public String toString() {
		return id+","+firstName+","+lastName;
	}

	public double getSalary() 
	{		
		return 0.0;
	}

}
