package collection.set;

public class Student {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public boolean equals(Object studObj) {
		// TODO Auto-generated method stub
		System.out.println("in equals()");
		Student s = (Student)studObj;
		
		return this.rollNo == s.rollNo && this.name.equals(s.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("in hashCode()");
		return rollNo+name.hashCode();
		//return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student("+rollNo+","+name+")";
	}
	
	
}
