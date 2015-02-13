import java.io.*;
public class Desirialize
{
   public static void main(String [] args)
   {
      SomePerson s = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("/Users/jonathangrajales/Desktop/SomePerson.html");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         s = (SomePerson) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("SomePerson class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Person Information:");
      System.out.println("Name: " + s.name);
      System.out.println("major: " + s.major);
      System.out.println("Cell: " + s.cell);
    }
}