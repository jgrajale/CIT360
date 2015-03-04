import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class CollectionsMap {

   public static void main(String[] args) {
      Map map = new HashMap(); 
      map.put("Gaby", "5 years old");
      map.put("Javier", "10 years old");
      map.put("Tony", "15 years old");
      map.put("Lucy", "20 years old");
      map.put("John", "20 years old");
      System.out.println();
      System.out.println(" Map Elements:");
      System.out.print("\t" + map);
      
      
      
      //Tree Map
      // Create a hash map
      TreeMap tm = new TreeMap();
      // Put elements to the map
      tm.put("Zara", new Double(3434.34));
      tm.put("Gabi", new Double(123.22));
      tm.put("John", new Double(1378.00));
      tm.put("Daisy", new Double(99.22));
      tm.put("Javier", new Double(-19.08));
      
     // Get a set of the entries
      Set set = tm.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance = ((Double)tm.get("Zara")).doubleValue();
      tm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " +
      tm.get("Zara"));
   }
}