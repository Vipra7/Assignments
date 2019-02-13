class  Point2D
{
	float x;
	float y;

	float ar[]=new float[2];

	Point2D()
	{
		float x=0.0f;
		float y=0.0f;
	}
	Point2D(float x, float y )
	{	
        this.x=x;
        this.y=y;
	}
	
	float getX()
	{
		return x;
	}
	void setX(float x)
	{
        this.x=x;
	}
	float getY()
	{
		return y;
	}
	void setY(float y)
	{
        this.y=y;
	}
	
	void setXY(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	float[] getXY()
	{   

        return ar;
	}
	void toString()
	{
		String(x,y);
	}
}
class Point3D extends Point2D
{
	float z;

	Point3D()
	{
        z=0.0;
	}
	Point3D(float x,float y,float z)
	{
		super(x,y);
		this.z=z;
	}
	
    float getZ()
    {
    	return z;
    }
    void setZ(float z)
    {
    	this.z=z;
    }
    float getXYZ()
    {
    	return  ;
    }
      void setXYZ(float x,float y,float z)
    {    
    	super(x,y);
    	this.z=z;
    }
    void toString()
    {
    	
    }

   
}
class TestCylinder
{
    public static void main(String args[])
    {
    	Cylinder C1=new Cylinder();
    	Cylinder C2=new Cylinder(5);
    	Cylinder C3=new Cylinder(5,10);
    	Cylinder C4=new Cylinder(5,10,"Black");
    	C1.setRadius(10);
    	C1.setHeight(20);
        System.out.println(C1.getArea());
    	System.out.println(C1.getVolume());
    }
}