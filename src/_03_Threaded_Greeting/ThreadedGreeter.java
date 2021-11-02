package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {

	int count;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		count = i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + count);
		if (count < 50) {
			Thread r1 = new Thread(new ThreadedGreeter(count+1));
			r1.start();
		}
	}

}
