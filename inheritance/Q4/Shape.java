abstract class Shape
{
	double length;
	double breadth;

	abstract double area(double length,double breadth);

	void displayArea()
	{
	System.out.println("the area is ");
	}
	Shape()
	{
	length=0;
	breadth=0;
	}


}