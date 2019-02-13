import java.util.*;
class Date
{
	int month,day,year;
	Date()
	{
		day=1;
		month=1;
		year=2000;
	}
	Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
		

		
    }

    void displayDate()
    {
    	System.out.println("the date is"+day+"/"+month+"/"+year);
    }
}

class DateTest
{      
     static Scanner p=new Scanner(System.in);
      public static void main(String args[])
    
     {
     	int day,month,year,a,b,c;
     	System.out.println("enter the date");
     	a=p.nextInt();
     
     		day=a;
     	
     	b=p.nextInt();
     	
     		month=b;
     	
     	c=p.nextInt();
     	
     		year=c;
     	

     	Date ob=new Date(day,month,year);
             	
     	ob.displayDate();
     }
}