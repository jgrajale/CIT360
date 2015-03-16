# MVC

* **What is MVC -**
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns. - Also refered as Data Interface Coordinator.

 * Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

 * View - View represents the visualization of the data that model contains.

 * Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.

 * **What it does -**
 	* Separates the data and calculations into the Model class, it separates the interface into the view class and the controller class coordinates the interaction between the model and the view class.  

 * In this folder there is an example of a calculator that multiplies, adds and subtracts using MVC 