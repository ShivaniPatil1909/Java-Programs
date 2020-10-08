package collection.set;

public class Person implements Comparable{
	
	private String name;
	
	public Person(String name){
		this.name=name;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return name;
	}

	@Override
	public boolean equals(Object arg0) {
		Person p = (Person) arg0;
		return this.name.equals(p.name);
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode()"+name.hashCode());
		return name.hashCode();
	}

	@Override
	public int compareTo(Object arg0) {
		Person p = (Person) arg0;
		String name1= p.getName();
		return name.compareTo(name1);
	}
}
