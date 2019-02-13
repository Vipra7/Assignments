import java.util.Scanner;
class Box 
{
    private double width;
    private double height;
    private double length;

    public void setDim()
    {
        height=15;
        width=14;
        length=10;
    }
    public double vol()
    {
        double volume;
        volume=height*length*width;
        return(volume);
    }

}
class BoxDemo
{
          public static void main (String args[])
                    {
            Box B=new Box();
            double d;
            B.setDim();
            B.vol();
            d=B.vol();
            System.out.println("Volume is"+d);
        }
    }

        