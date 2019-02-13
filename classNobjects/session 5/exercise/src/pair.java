class Pair
{
  int pa[]=new int[10];
  private int x;
  private int y;


  void setx(int x)
  {
     this.x=x;

  }
   void sety(int y)
  {
     this.y=y;
     
  }
  void set(int x,int y)
  {
     this.x=x;
     this.y=y;

  }
   public int getx()
  {
     
    return x; 
  }
  public int gety()
  {
     
    return y; 
  }
  void sort()
  { int i,j,temp;
   for(i=0;i<pa.length;i++)
   {
    for(j=1;j<pa.length;j++)
    {
    (pa[i]>pa[j])
    {
      temp=pa[i];
      pa[i]=pa[j];
      pa[j]=temp;
    }

   }
  }
}

class PairTest
{
  public static void main(String args[])
  Scanner o=new Scanner(System.in);
  System.out.println("enter length of array");
  {
    for (i=0;i<n
  }

  int x=o.nextInt();


}