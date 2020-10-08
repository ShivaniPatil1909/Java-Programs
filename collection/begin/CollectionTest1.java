package collection.begin;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
	public static void main(String args[]){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		 
		Collection<Integer> numList1;
		//numList1 = new Collection<Integer>();
		
		System.out.println("Number of elements: "+numList.size());
		
		for(int i=0; i< 10; i++){
			int n=0;
			n= (int)(Math.random()*100);
			numList.add(n);
		}
		
		System.out.println("Number of elements: "+numList.size());
		System.out.println("Elements in ArrayList");
		
		numList1 = numList;
		
		//numList1.addAll(numList);
		for(Integer num:numList1)//foreach loop
			System.out.println(num);
		
		System.out.println("is 10 exists in list:"+numList1.contains(10));
		
		int num = numList.get(6);
		
		System.out.println(num+" in list exists:"+numList.contains(num));
	}

}
