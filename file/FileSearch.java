import java.io.*;
import java.util.*;
class FileSearch
{
  public static void main(String args[])
  {     
         File f=new File("data.txt");
           
      String str[]=null; 
      
      BufferedReader bin = new BufferedReader(new FileReader(f)); 
      String s; 
      Scanner ob=new Scanner(System.in);
       System.out.println("enter the string to find ");   
      String input=ob.next();
      int count=0;   
      while((s=bin.readLine())!=null)   
      {

        str=s.split(" ");
          for(int i=0;i<str.length;i++)  
          {
                 if (str.equals(input))
                 {   
                   count++;    
                 }
          }
      }
      if(count!=0) 
      {
         System.out.println("The given word is present ");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
                  

   }
 }



        
       

 

