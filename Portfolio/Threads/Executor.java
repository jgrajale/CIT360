package Threads;
import java.util.concurrent.*;

public class Executor {

	public static void main(String args[])
	{
		ExecutorService pool = Executors.newFixedThreadPool(3);
		PrintJob []vec = { new PrintJob("David", 4),
				new PrintJob("Javier", 12),
				new PrintJob("Jonh", 15),
				new PrintJob("Aubrey", 9),
				new PrintJob("Jasmine", 3),
				new PrintJob("Tatiana", 10)};
		for(int i=0; i<vec.length; i++)
		{
			pool.submit(vec[i]);
		}	
	}
}
