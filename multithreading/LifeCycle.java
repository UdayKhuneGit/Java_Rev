package multithreading;
 // Extend Thread Class 1st STEP
public class LifeCycle extends Thread{
	//oveeride run method 2nd STEP
	public void run() { // run method override hote Thread class madhun
		System.out.println("override run");
	}

	public static void main(String[] args) {
		
		// create obj of the class 3rd STEP
		LifeCycle lifeCycle = new LifeCycle();
		// Override start method 4th STEP
		lifeCycle.start();  // thread start hote
		
		// ekhadya method la thread declare krich asel tr obj create krun start karicha mg thread asa declasre hote ti method
		// ata ya ex mdeh lifecycle la thread declare kelai
		
	}
}
