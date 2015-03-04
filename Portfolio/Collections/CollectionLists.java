import java.util.*;

public class CollectionList {
   public static void main(String args[]) {
   
	  ArrayList<String> lst = new ArrayList<String>();

	  /*Elements added to Array List*/
	  lst.add("Cat");
	  lst.add("Dog");
	  lst.add("Chair");
	  lst.add("Floor");
	  lst.add("Food");

	  /* Displaying array list*/
	  System.out.println("Array:"+lst);

	  /*Add element at the given index*/
	  lst.add(0, "Wall");
	  lst.add(1, "Couch");

	  /*Remove elements from array list like this*/
	  lst.remove("Stuff");
	  lst.remove("Dog");

	  System.out.println("Current array list is:"+lst);

	  /*Remove element from the given index*/
	  lst.remove(1);

	  System.out.println("Current array list is:"+lst);
   }
}