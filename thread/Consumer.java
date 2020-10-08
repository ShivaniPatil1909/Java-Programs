package thread;

public class Consumer extends Thread {
	private Box box;
	
	
	public Consumer(Box box) {
		super();
		this.box = box;
	}


	public void run(){
		
		for(int i=1;i<=5; i++){
			int num =0;
			try{
			   num = box.getData();
			 //  String threadName;
			  // threadName= getName();
			  // System.out.println(threadName+" : has got "+num+" from Box");
			}catch(InterruptedException e){   
				e.printStackTrace();
			}
		}
	}
}
