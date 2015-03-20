# Threads, Executors, Runnables, and Android Handlers 

**What are Threads? -**
 * A thread is a program's path of execution. 

Example: A program is not capable of drawing pictures while reading keystrokes. The program must give its full attention to the keyboard input lacking the ability to handle more than one event at a time. The ideal solution to this problem is the seamless execution of two or more sections of a program at the same time. Threads allows us to do this.

 * Multithreading - Running many threads concurrently within a single program. From a logical point of view, multithreading means multiple lines of a single program can be executed at the same time.

 * **Two ways of creating threads: **

  * Implementing Interface
  * Extending a class

Extending a class is the way Java inherits methods and variables from a parent class.

Interfaces provide a way for programmers to lay the groundwork of a class. They are used to design the requirements for a set of classes to implement. The interface sets everything up, and the class or classes that implement the interface do all the work. 

* Threads.java demonstrates how treads work and Race.java with Racer.java demonstrates how multithreading works.

**What are the Executors? -**

 * The Executor framework is an abstraction layer over the actual implementation of java multithreading. It is the first concurrent utility framework in java and used for standardizing invocation, scheduling, execution and control of asynchronous tasks in parallel threads. The execution rules are defined during the creation of the constructor. And then the executor runs the concurrent threads following the rules set earlier.

 * Executor implementation in java uses thread pools which consists of worker threads. The entire management of worker threads is handled by the framework. So the overhead in memory management is much reduced compared to earlier multithreading approaches. - see Exector1.gif

 * **Create an Executor**

 First you need to create an instance of an Executor or ExecutorService. The Executor class has a number of static factory methods to create an ExecutorService depending upon the requirement of the application. Following are two main methods to create executor service.

   * The newFixedThreadPool () returns a ThreadPoolExecutor instance with an initialized and unbounded queue and a fixed number of threads.
   * The newCachedThreadPool () returns a ThreadPoolExecutor instance initialized with an unbounded queue and unbounded number of threads.

* Executor.java and PrintJob.java demonstrates how Executors work

**Runnables**

* A Runnable is basically a type of class (Runnable is an Interface) that can be put into a thread, describing what the thread is supposed to do.
 
* If you make a new Thread with runnable as it's parameter, it will call the run method in a new Thread.

* **Creating a Runnable process block** 

* A Runnable process block is a simple class that implements a run() method. Within the run() method is the actual task that needs to be executed by a running thread. By implementing a class with the Runnable interface, we ensure that the class holds a run() method.

* There are examples of runnable process blocks on PrintJob.java, Threads.java and Racer.java

**Android Handlers**

* A Handler allows you to send and process Message and Runnable objects associated with a thread's MessageQueue. Each Handler instance is associated with a single thread and that thread's message queue. When you create a new Handler, it is bound to the thread / message queue of the thread that is creating it -- from that point on, it will deliver messages and runnables to that message queue and execute them as they come out of the message queue.

* When a process is created for your application, its main thread is dedicated to running a message queue that takes care of managing the top-level application objects (activities, broadcast receivers, etc) and any windows they create. You can create your own threads, and communicate back with the main application thread through a Handler. This is done by calling the same post or sendMessage methods as before, but from your new thread. The given Runnable or Message will then be scheduled in the Handler's message queue and processed when appropriate.

* The AndroidHandler folder contains a simple android project that demonstrates Android Handlers  