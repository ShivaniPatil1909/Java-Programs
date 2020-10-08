package collection.set;
import java.util.Set;
import java.util.HashSet;
/*  Set
 *   |
 *    --- HashSet
 *    --- LinkedHashSet
 * 
 */

public class SetTest1 {
	public static void main(String args[]){
		Set<Double> set1;
		
		set1 = new HashSet<Double>();
		
		set1.add(12.9);
		set1.add(11.0);
		set1.add(21.0);
		set1.add(44.3);
		set1.add(11.0);
		set1.add(11.0);
		set1.add(44.3);
		set1.add(null);
		
		
		for(Double d: set1)
			System.out.println(d);
			
		
	}

}
