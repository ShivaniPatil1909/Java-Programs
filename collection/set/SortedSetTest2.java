package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest2 {

	public static void main(String[] args) {
		Set<Person> set1;
		
		set1 = new TreeSet<Person>();
		
		String names[]= {"Nikhil", "Rahul", "Arvind", "Pooja", "Pooja"};
		
		for(String name:names)
			set1.add(new Person(name));
		
		System.out.println("set1: "+set1);
		// TODO Auto-generated method stub

	}

}
