package thread;

public class Producer extends Thread {
	private Box box;
	
	
	public Producer(Box box) {
		super();
		this.box = box;
	}


	public void run(){
		
		for(int i=1;i<=5; i++){
			int num ;
			num = (int)(Math.random()*100);
			num+=1000*i;
			try{
			   box.putData(num);
			 //  String threadName;
			 //  threadName= getName();
			 //  System.out.println(threadName+" : has put "+num+" in Box");
			
			}catch(InterruptedException e){   
				e.printStackTrace();
			}
		}
	}
}
