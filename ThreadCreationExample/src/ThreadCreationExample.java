
public class ThreadCreationExample {
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Thread1());
		t1.start();
		
		
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}

}
