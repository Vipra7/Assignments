import java.util.*;
import java.io.*;
class Base
 {
    Base() throws IOException 
    {
        throw new IOException();
    }
}

class Derived extends Base
{
    Derived() throws IOException
        { 
            super();
        }
        /* try 
          {

             super(); 
         } 
         catch (IOException e) 
            {
                System.out.println("We have exception from the ");
            }
        } */ 
     public static void main(String srgs[]) 
     { 
        try
        {
       Derived ob=new Derived(); 
      }
      catch(Exception e)
      {
          System.out.println("hey");
      }
}
}





