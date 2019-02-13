import java.io.*;
import java.util.*;
class FileWrite
{
	public static void main(String agrs[])throws IOException
	{
      File f=new File("file1.txt");
      BufferedWriter bout=new BufferedWriter(new FileWriter(f));
      Scanner s = new Scanner(System.in);
             System.out.println("\nEnter a String:");
 	     while(s.hasNext())
 	     {
               bout.write(s.nextLine());
               bout.newLine();
        }

        bout.close();

	}
}
