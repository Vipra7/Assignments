   class PointsDemo2
{
    public static void main (String args[])
    {
    Points P2= new Points(7,8);
    Points P3=new Points(11,5,3,3);
    double d1;
    /*P2.setx1(5);
    P2.sety1(7);
    P3.setx2(9);
    P3.sety2(10);*/
    d1=P3.distance(P2);
    System.out.println(d1);
    }
}