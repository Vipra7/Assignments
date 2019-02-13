import java.io.*;
import java.util.*;
class FileRead
{
  public static void main(String agrs[])throws IOException
  {
  		File f=new File("file1.txt");
 		 BufferedReader bin=new BufferedReader(new FileReader(f));
 		 String str;
	      System.out.println("The contents of the file are: ");
	       while((str=bin.readLine())!=null)
	       {
                         System.out.println(str);
	
    	   }
   }
}