import java.util.*;

class Second

{
	   static void function()

	{
        int n, i,j;
		Scanner b = new Scanner(System.in); 
        int a[] = new int [10];
        System.out.println("Enter the number to be searched: ");
		n = b.nextInt();
		System.out.println("Enter the elements of array:");

		for ( i=0 ; i<10 ; i++)
		{
			a[i] = b.nextInt();
		}	
	

		for(i=0 ; i<10 ; i++)
		{
         if (a[i]==n)
         {           
           System.out.println(" The Entered number is present at location " + (i + 1) );
           System.exit(0);
            }
          }
        System.out.println(" -1 ");
    }

 public static void main(String args[])

    {

        function();

    }

}
