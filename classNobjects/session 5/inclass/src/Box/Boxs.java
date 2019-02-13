import java.util.Scanner;
class Boxs
{
     public double width;
     public double height;
     public double length;

     static void setDim()
    {
        height=15;
        width=14;
        length=10;
    }
    static double vol()
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

        