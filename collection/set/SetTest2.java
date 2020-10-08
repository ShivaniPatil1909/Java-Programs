package collection.set;
import java.util.Set;
import java.util.LinkedHashSet;
/*  Set
 *   |
 *   |--- HashSet
 *   |--- LinkedHashSet
 * 
 */

public class SetTest2 {
	public static void main(String args[]){
		Set<Double> set1;
		
		set1 = new LinkedHashSet<Double>();
		
		set1.add(12.9);
		set1.add(11.0);
		set1.add(21.0);
		set1.add(44.3);
		set1.add(11.0);
		set1.add(11.0);
		set1.add(44.3);
		set1.add(null);
		set1.add(55.55);
		
		
		
		for(Double d: set1)
			System.out.println(d);
			
		
	}

}
