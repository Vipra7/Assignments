class Distance
{
  float feet,inch,feet1,inch1;

Distance()
{
    System.out.println("Nothing");
}
Distance(float feet,float inch)
{
    this.feet=feet;
    this.inch=inch;
    this.feet1=feet1;
    this.inch1=inch1;
}
float getfeet()
{
    return feet;

}
float getinch()
{
    return inch;
}

float getfeet1()
{
    return feet1;

}
float getinch1()
{
    return inch1;
}
public void setfeet(float feet,float inch)
{
 
    this.feet=feet;
    this.inch=inch;
}
public void setfeet(float feet,float feet1,float inch, float inch1)
{

   this.feet=feet;
    this.feet1=feet1;
    this.inch=inch;
    this.inch1=inch1; 
}
public void sum(Distance D)
{float fsum,isum;
  fsum=getfeet()+D.getfeet();
  isum=getinch()+D.getinch();
  System .out .println(fsum);
  System .out .println(isum);
}

}


