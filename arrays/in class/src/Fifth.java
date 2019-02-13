import java.util.Scanner;

class Fifth

{

	public static void main(String args[])

	{

		int r1, r2;

		Scanner x = new Scanner(System.in); 

		int a[] = new int [10];

		int b[] = new int [10];

		System.out.println("Enter the rows of first and second array(max 10)");

		r1 = x.nextInt();

		r2 = x.nextInt();

		System.out.println("Enter the elements of 1st array");

		for ( int i = 0; i < r1; i++)

		{

			a[i] = x.nextInt();

			

		}

		System.out.println("Enter the elements of 2nd array");

		for ( int j = 0; j < r1; j++)

		{

			b[j] = x.nextInt();

			

		}	

		for (int c = 0; c < 5; c++)

		{

			for (int v= 0; v<c; )

			if (a[v] == a[c])

				{

					v++;

				}

			else 

			    {

				System.out.println(a[v]);

				v++;

			    }	



		}



	}

}