package thread;

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("in main()");
		//creating a thread 
		Thread t1 = new MyThread();
		//invoking run method
		//t1.run();  // not expected to do like this
		t1.start();
		
		for(int i=0; i<10; i++)
			System.out.println("in main(), i="+i);
		System.out.println("end main()");

	}

}
