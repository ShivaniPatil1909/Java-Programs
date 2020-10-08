package collection.begin;

import java.util.*;

public class CollectionTest2 {

	public static void main(String[] args) {
		String names[] = {"Amita", "Bina", "Chetan", "Dinesh"};
		ArrayList<String> nameList1 = new ArrayList<String>();
		
		for(String name: names)
			nameList1.add(name);
		System.out.println("Bina in List is present: "
			+nameList1.contains("Bina"));
		
		nameList1.remove("Chetan");
		
		for(String name:nameList1)
			System.out.println(name);
	}
}
