package thread;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {
	
	int start=0, end=0;
	List<Integer> list;
		
	public MyRunnable(int start, int end, List<Integer> list) {
		super();
		this.start = start;
		this.end = end;
		this.list= list;
	}

	@Override
	public void run() {
		System.out.println("in run()");
		for(int m = start; m<=end;m++)
		{
			Thread thread1= Thread.currentThread();
			
			if(PrimeNumberGenerator.isPrime(m)){
				//System.out.println(thread1.getName()+": "+m);
				list.add(m);
			}
				
		}
	}
	
	public static  void main(String args[]){
		System.out.println("in main");
		List<Integer> list = new ArrayList<Integer>();
		int m= 11, n=155;
		Runnable r1,r2;
		r1 = new MyRunnable(m, n/2,list);
		r2 = new MyRunnable(n/2+1,n,list);
		
		
		Thread t1 = new Thread(r1);
		t1.setName("Thread1");
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.setName("T2");
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
		//printing all the elements in the list
		for(Integer num:list)
			System.out.println(num);
		
		System.out.println("end main");
	}

}
