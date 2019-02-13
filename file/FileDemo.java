import java.io.*;
import java.util.*;
class FileDemo
{
  public static void main(String args[])
  {
  	try
  	{
  		File f=new File("data.txt");
  		  BufferedWriter bout=new BufferedWriter(new FileWriter(f));
      Scanner s = new Scanner(System.in);
             boolean flag=true;
           while(flag)
           {
           	System.out.println("enter the serial n.");
           	bout.write("");
           	bout.write(Integer.toString(s.nextInt()));
           	System.out.println("enter the name.");
           	bout.write("");
           	System.out.println("enter the cgpa");
           	bout.write(s.next());
           	bout.write(Float.toString(s.nextFloat()));
           	bout.write("");
           	System.out.println("enter the grade");
           	bout.write("");
           	bout.write(s.next().charAt(0));
           bout.newLine();
           System.out.println("Do you want to continue");
           char c=s.next().charAt(0);
            bout.newLine();
           if(c=='n'||c=='N')
           {
           	flag=false;
           }

        }bout.close();           

         BufferedReader bin=new BufferedReader(new FileReader(f));
 		 String str;
	      System.out.println("The contents of the file are: ");
	       while((str=bin.readLine())!=null)
	       {
                         System.out.println(str);
	
    	   }
           
     }
           catch(Exception e)
           {
           	System.out.println(e);

           }

    }

 }

