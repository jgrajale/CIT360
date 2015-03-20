package Threads;

public class Race {

	public static void main(String[]args){
		Racer racer = new Racer();
		Thread jonhThread = new Thread(racer,"Jonh");
		Thread steveThread = new Thread(racer,"Steve");
		
		//Race to start, tell threads to start
		
		jonhThread.start();
		steveThread.start();
	}
}
