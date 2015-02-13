import java.io.*;

public class Serialize
{
   public static void main(String [] args)
   {
      SomePerson s = new SomePerson();
      s.name = "Jonh";
      s.major = "CIT";
      s.cell = "123456789";
      try
      {
        //Serializing Data 
        FileOutputStream fileOut =
              new FileOutputStream("/Users/jonathangrajales/Desktop/SomePerson.html");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.close();
        fileOut.close();
        System.out.printf("Data has been transferred to Desktop");
        
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}