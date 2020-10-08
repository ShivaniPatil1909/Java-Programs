package collection.set;
import java.util.Set;
import java.util.LinkedHashSet;
/*  Set
 *   |
 *   |--- HashSet
 *   |--- LinkedHashSet
 * 
 */

public class SetTest {
	public static void main(String args[]){
		int numSet1[] = {1,3,5,7,9,9};
		
		int numSet2[] = {1,2,3,4,5};
			
		Set<Integer> set1, set2, set3=null;
		
		set1 = new LinkedHashSet<Integer>();
		set2 = new LinkedHashSet<Integer>();
		
		for(int i:numSet1)
			set1.add(i);
		
		for(int i:numSet2)
			set2.add(i);
		
		System.out.println("set1: "+set1);
		System.out.println("set2: "+set2);
		
		set3= set1;
		//set3.addAll(set2);  // gives union of set1 and set2
		//set3.removeAll(set2); // gives difference of set1 and set2
		set3.retainAll(set2) ; // gives intersection of set1 and set2
		
		System.out.println("set1: "+set1);
		System.out.println("set2: "+set2);
		System.out.println("set3: "+set3);
			
	}

}
