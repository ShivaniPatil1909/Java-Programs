package collection.set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
/*  Set
 *   |
 *   |--- HashSet
 *   |--- LinkedHashSet
 * 
 */

public class SetTest3 {
	public static void main(String args[]){
		Set<Person> set1;//, set2, set3=null;
		
		set1= new HashSet<Person>();
		
		set1.add(new Person("Abhay"));
		System.out.println("------------------");
		set1.add(new Person("Abhay"));
		System.out.println("------------------");
		set1.add(new Person("Chirag"));
		System.out.println("------------------");
		set1.add(new Person("David"));
		System.out.println("------------------");
		
		System.out.println("set1: "+set1);
		for(Person p: set1)
			System.out.println(p);
				
	}

}
