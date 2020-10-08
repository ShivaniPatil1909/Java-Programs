package thread;

public class InterprocessCommunication {

	public static void main(String[] args) {
		Box box = new Box();
		
		Producer p1 = new Producer(box);
		p1.setName("P-Amit");
		
		Consumer c1 = new Consumer(box);
		c1.setName("C-Neha");
	
		Producer p2 = new Producer(box);
		p2.setName("P-Mitali");
		
		Consumer c2 = new Consumer(box);
		c2.setName("C-Meena");
	
		p1.start();
		c1.start();

		p2.start();
		c2.start();

	}

}
