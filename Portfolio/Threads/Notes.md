# Threads, Executors, Runnables, and Android Handlers 

* **What are Threads? -**
 * A thread is a program's path of execution. 

 * Example: A program is not capable of drawing pictures while reading keystrokes. The program must give its full attention to the keyboard input lacking the ability to handle more than one event at a time. The ideal solution to this problem is the seamless execution of two or more sections of a program at the same time. Threads allows us to do this.

 * Multithreading - Running many threads concurrently within a single program. From a logical point of view, multithreading means multiple lines of a single program can be executed at the same time.

 ** Two ways of creating threads: **

  * Implementing Interface
  * Extending a class

 * Extending a class is the way Java inherits methods and variables from a parent class.

 * Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.

 * **What it does -**
 	* Separates the data and calculations into the Model class, it separates the interface into the view class and the controller class coordinates the interaction between the model and the view class.  

 * In this folder there is an example of a calculator that multiplies, adds and subtracts using MVC 