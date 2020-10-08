package thread;

public class MyThread extends java.lang.Thread{

	public void run(){
		System.out.println("in run method");
		for(int j=11; j<21;j++)
			System.out.println("in run(), j="+j);
	}
}
