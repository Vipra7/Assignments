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
	Date(int x, int y, int z)
	{
		x=day;
		y=month;
		z=year;
		
		return 
    }

    void diaplayDate()
    {
    	System.out.println("the date is"+day+"/"+month+"/"+year);
    }
}

class DateTest
{
     static Scanner x=new Scanner(System.in);
     public static void main(System.in)
     {
     	int day,month,year;
     	day=x.nextInt();
     	month=x.nextInt();
     	year=year.nextInt();

     	Date ob=new Date(day,month,year);
     	ob.Date(day,month,year);
     	ob.displayDate();
     }
}