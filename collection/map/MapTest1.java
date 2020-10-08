package collection.map;

/*
 rollNo   Name
 1        Amit
 2        Brij
 3        Chirag
 */
import java.util.Map;
import java.util.HashMap;
public class MapTest1 {
	static int rollNos[]={1,11,1,33,44};
	static String names[]={"Amit","Brij","Chirag","David","Esha"};
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1;
		map1 = new HashMap<Integer, String>();
		
		for(int i=0; i<rollNos.length; i++){
			map1.put(rollNos[i], names[i]);
			
		}
		
		for(int i=0; i<rollNos.length; i++)
			System.out.println(rollNos[i]+":"+map1.get(rollNos[i]));
		

	}

}
