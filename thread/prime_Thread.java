package thread;
import java.util.Scanner;

public class prime_Thread implements Runnable{
	
int start=0, end=0,nSum=0;
	
	
	public prime_Thread(int start, int end) {
		
		this.start = start;
		this.end = end;
	}

	public void run(){
		
		System.out.println("in run()");
		for(int m = start; m<=end;m++)
		{
			if(isPrime(m)) {
				nSum=nSum+m;
				System.out.println(m);
			}
			
		}
		 System.out.println("The sum is:"+nSum);
		 
	}
	
	 public boolean isPrime(int n)
	 {
		if(n<2)
			return false;
		if(n==0)
			return true;
		for(int d=2;d<=n/2;d++)
			if(n%d==0) 
				return false;
				
			
		return true;
	
	 }

	
	public static void main(String args[])
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range(m-n)");
		m=sc.nextInt();
		n=sc.nextInt();
		Runnable t1 = new prime_Thread(m,n);
		Thread t2=new Thread(t1);            
	    t2.start();
	        
	    sc.close();
		
	}

}
