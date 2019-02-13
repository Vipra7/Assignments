import java.util.*;
class Book1
{
	String book,author;
	int pages;
	
	void set(String book, String author, int pages)
	{
	this.book=book;
	this.author=author;
	this.pages=pages;
	}
	void get()
	{
	System.out.println("name"+book+"author"+ author+"pages"+pages);
	}
	public static void main(String args[]) 
	{ 
	
	Scanner g =new Scanner(System.in);
	Book1 b[]=new Book1[10];
	System.out.print("enter data for two books");
	for (int i=0;i<2;i++)
	{
	
	System.out.println("enter the name of book, author and pages");
	String n=g.nextLine();
	String a=g.nextLine();
	int p=g.nextInt();
	b[i].set(n,a,p);

	}



	}
}