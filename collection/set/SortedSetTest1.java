package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest1 {

	public static void main(String[] args) {
		Set<String> set1;
		
		set1 = new TreeSet<String>();
		
		String names[]= {"Nikhil", "Rahul", "Arvind", "Pooja", "Pooja"};
		
		for(String name:names)
			set1.add(name);
		
		System.out.println("set1: "+set1);
		// TODO Auto-generated method stub

	}

}
