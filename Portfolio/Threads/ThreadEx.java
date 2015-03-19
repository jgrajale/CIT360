package Threads;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is one way to create a thread
		MyThread mt = new MyThread();
		// We can assign a name
		mt.setName("Thread 1");
		mt.start();
		
		MyThreads2 mt2 = new MyThreads2();
		Thread t = new Thread(mt2);
		
		//New Thread
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt2); 
		t.setName("Thread 2");
		t2.setName("Thread 3");
		t3.setName("Thread 4");
		t.start();
		t2.start();
		t3.start();
		
	}

}

class MyThread extends Thread{
	public void run(){
		System.out.println("executing");
	}
}

class MyThreads2 implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" "+"Thread is Running.");

	}
	
}