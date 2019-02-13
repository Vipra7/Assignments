import java.util.Scanner;
class Boxes
{
     static double width;
     static double height;
     static double length;

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
          public static  void main (String args[])
                    {
            Box B=new Box();
            double d;
            Box.setDim();
            Box.vol();
            d=Box.vol();
            System.out.println("Volume is"+d);
        }
    }

        