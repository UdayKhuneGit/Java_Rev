package multithreading;
// better syntax sathi main method sathi vegla class kricha tyane complex nahi hot code


//itha multiple task sathi multiple class banavle tyat run method override keli
	class Mythread3 extends Thread{
		public void run() {
			System.out.println("Thread 3 sathi task");
		}
	}
	class Mythread4 extends Thread{
		public void run() {
			System.out.println("Thread 4 sathi task");
		}
	}

// eka class mdhe ek ch rum method override hou shakte
// multiple task ek thread nahi kru shakat ka tr ek thread ek ch kam krta tyala pudhe divide nahi krta yet
// itha single task multiple thread complete krtiat
public class Thread_Demo extends Thread {
	
	// eka class mdhe jast sadhe class banavta nahi yet jya mdhe main method ahe
	public void run() {
		System.out.println("Task complete");
	}
	
    // ek thread parat or 2/3 vela initate kela tr exception yeta ka tr lifecycle mdhe sangitali ek thread ekda ch start hote n ekda ch marte
	//creating multiple threads
	public static void main(String[] args) {
		Thread_Demo t = new Thread_Demo();
		t.start();// thread 1 
		
		Thread_Demo t1= new Thread_Demo();
		t1.start(); // thread 2
		
		Mythread3 t3 = new Mythread3();
		t3.start();
		Mythread4 t4= new Mythread4();
		t4.start();
	}
	

}
