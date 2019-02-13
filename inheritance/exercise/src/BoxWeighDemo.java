import java.util.*;
class Box
{
	float width;
	float height;
	float depth;

	Box()
	{
		widht=0;
		height=0;
		depth=0;
	}

	Box(float width,float height,float depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	Box(float width,float height)
	{
      this.width=width;
      this.height=height;
	}

	float getWidth()
	{
		return width;
	}
	float getHeigth()
	{
		return height;
	}

    float getDepth()
    {
    	return depth;
    }

    



    void setDimentions(float width,float height,float depth)
{
        this.width=width;
		this.height=height;
		this.depth=depth;	
}

void display()

{   float volume;
	volume=(getWidth()*getHeight()*getDepth()*getWeigth());
	System.out.println("The volume is"+volume);
}


class BoxWeight extends Box

{

float weight;

BoxWeight()
{
	super();
	weight=0;
}


BoxWeight(float width,float height,float depth,float weight)
	{
	  super(weight,height,depth);
	  this.weight=weight;
      }

BoxWeight(float height,float width,float weight){
		super(height,width);
		this.weight=weight;
	}

 float getWeight()
    {
    	return weight;
    }

void setDimentions(float width,float height,float depth,float weight)
{
    super.setDimentions(width,heigth,depth);
    this.weight=weight;
}

void display()
{   float totalweight;
	totalweight=getWidth()*getHeigth()*getDepth()*getWeight();
	System.out.println("The volume is"+totalweight);
}

}
class BoxWeightDemo
{
 public static void main(String args[])
 { float width,height,depth,weight;
 	Scanner x=new Scanner(System.in);
   BoxWeight B1=new BoxWeight();
   BoxWeight B1=new BoxWeight(3,4,5,6);
   
   System.out.println("Enter the value of width");
   width=x.newFloat();
   System.out.println("Enter the value of heigth");
   height=x.newFloat();
   System.out.println("Enter the value of depth");
   depth=x.newFloat();
   System.out.println("Enter the value of weigth");
   weight=x.newFloat();
   B1.setDimentions(width,height,depth);
   B1.display();


}
}
}
 
