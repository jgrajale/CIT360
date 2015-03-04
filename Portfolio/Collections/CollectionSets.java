import java.util.*;

public class CollectionsSet {

  public static void main(String args[]) { 
     int count[] = {24,20,5,54,45,20};
     Set<Integer> set = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
        System.out.println(set);
  
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
        System.out.println("Sorted list is:"+" "+ sortedSet);
      

        System.out.println("The First number is : "+
                          (Integer)sortedSet.first());
        
        
        System.out.println("The last last number is: "+
                        (Integer)sortedSet.last());
     }
     catch(Exception e){}
  }
} 