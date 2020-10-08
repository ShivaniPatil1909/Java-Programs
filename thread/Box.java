package thread;

public class Box {
	private int data;
	private boolean isEmpty;
	
	Box()
	{
		isEmpty=true; //initially box is empty
	}
	
	synchronized public void putData(int data) throws InterruptedException
	{
		while(!isEmpty)
			wait();  //wait until box is not empty or data is in box
		
		this.data =data;
		isEmpty=false;
		
		notifyAll();
		
		String threadName;
		threadName= Thread.currentThread().getName();
		System.out.println(threadName+" : has put "+data+" in Box");
		
		
	}
	
	public synchronized int getData() throws InterruptedException
	{
		while(isEmpty)
			wait(); //wait until box is empty
		int val = data;
		isEmpty = true;
		
		notifyAll();
		
		String threadName;
		threadName= Thread.currentThread().getName();
		System.out.println(threadName+" : has got "+val+" from Box");
		
		
		return val;
	}

}
