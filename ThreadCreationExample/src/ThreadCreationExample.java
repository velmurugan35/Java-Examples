import java.util.ArrayList;


public class ThreadCreationExample {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		int i = 0;
		Thread1 runnable = new Thread1(arrayList, i); 
		
		Thread t1 = new Thread(runnable,"Thread 1");
		t1.start();
		
		Thread t2 = new Thread(runnable,"Thread 2");
		t2.start();
		
		
		
	}

}
