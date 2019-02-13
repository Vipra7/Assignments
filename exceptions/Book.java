import java.io.*;
class Book
{
	String book,author;
	int pages;
	static DataInputStream g=new DataInputStream(System.in);
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
	public static void main(String args[]) throws IOException
	{
	Book b[]=new Book[10];
	System.out.print("enter data for two books");
	for (int i=0;i<2;i++)
	{
	b[i]= new Book();
	System.out.println("enter the name of book, author and pages");
	String n= g.readLine();
	String a= g.readLine();
	int p= Integer.parseInt(g.readLine());
	b[i].set(n,a,p);

	}


	}
}