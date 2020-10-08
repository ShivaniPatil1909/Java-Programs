package collection.set;

import java.util.HashSet;
import java.util.Set;

public class set_oper {
	
	public static void main(String arg[]) 
	{	
		Book b1 = new Book("Let Us C",4042, 300f);
		Book b2 = new Book("Java",4082, 700f);
		Book b3 = new Book("Computer Networking",6042, 550f);
		
		
		Set<Book> s1=new HashSet<Book>();
		Set<Book> s2=new HashSet<Book>();
		
		s1.add(b1);
		s1.add(b3);
		s2.add(b3);
		s2.add(b2);
		
		Set<Book> union = new HashSet<Book>(s1); 
		union.addAll(s2);
		System.out.print("Union of the two Set"); 
	    System.out.println(union); 
	
	    Set<Book> intersection = new HashSet<Book>(s1); 
	    intersection.retainAll(s2); 
	    System.out.print("Intersection of the two Set"); 
	    System.out.println(intersection); 
	    
	    Set<Book> difference = new HashSet<Book>(s1); 
	    difference.removeAll(s2); 
	    System.out.print("Difference of the two Set"); 
	    System.out.println(difference); 
	 	
	}
}
