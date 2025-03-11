package multithreading;

public class Runnable_Thread implements Runnable {
	
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		Runnable_Thread rt= new Runnable_Thread();
		Thread th = new Thread(rt);
		th.start();
	}

}
