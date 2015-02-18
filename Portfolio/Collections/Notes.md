#  Collections

* **Collections -** Sometimes called a container — is simply an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. A Collection is a lot like an Array, it hold references to other objects. Unlike an Array, collections are dynamic, in an array you needd to give it the amount of objects you want to hold, in a list of a set is dinamic and it can change by itself. 

	* Interfaces: These are abstract data types that represent collections. Interfaces allow collections to be manipulated independently of the details of their representation. In object-oriented languages, interfaces generally form a hierarchy.
	* Implementations: These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.
	* Algorithms: These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface. In essence, algorithms are reusable functionality.


** In the collections1.java I'm basically creating a list and adding each one of the objects in the list and printing them. The collections2.java I created two different arrays of items, List1 and List2, in the string x I'm adding each one of the things in List1 and printing it. In the List2 I'm doing hte same thing and in order to print it, I just need to change List1.size() to List2.size() and List1.get to List2.get