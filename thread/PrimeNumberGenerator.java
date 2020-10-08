package thread;

public class PrimeNumberGenerator extends Thread {
	int start=0, end=0;
	
	
	public PrimeNumberGenerator(int start, int end) {
		super("Prime-Number1");
		this.start = start;
		this.end = end;
	}

	public void run(){
		
		System.out.println("in run()");
		for(int m = start; m<=end;m++)
		{
			if(isPrime(m))
				System.out.println(getName()+": "+m);
		}
	}
	
	static final boolean isPrime(int n){
		if(n<2)
			return false;
		if(n==0)
			return true;
		for(int d=2;d<n/2;d++)
			if(n%d==0)
				return false;
		return true;
	}
	
	public static  void main(String args[]){
		System.out.println("in main");
		Thread t1 = new PrimeNumberGenerator(11,44);
		t1.setName("Thread1");
		t1.start();
		System.out.println("end main");
	}

}
