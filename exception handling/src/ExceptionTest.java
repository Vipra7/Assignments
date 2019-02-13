class ExceptionTest
{
	public static void main(String args[])

	{
	    try
	    {
	    		int x;
	    		x=50/0;
	     }
	    catch(ArithmeticException e)
	    {
	    	System.out.print("the exception is "+e);

	    }
	     try
	    {
	    		int a[]=new int[10];
	    		a[20]=50;
	     }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.print("the exception is "+e);
	    	
	    }
	     try
	    {
	    		String s="Vipra";
	    		int y=Integer.parseInt(s);
	    		
	     }
	    catch(NumberFormatException e)
	    {
	    	System.out.print("the exception is "+e);
	    	
	    }

	    try
	    {
	    		String s=null;
	    		System.out.print("the exception is "+(s.length()));
	     }
	    catch(NullPointerException e)
	    {
           System.out.print("the exception is "+e);
	    }

	    try
	    {
	    	String s=new String();
	    	Scanner s1 = s1.next();
	    	if(s==NULL)
	    		throw new IOException("no input");
	    	
	    	}
	    catch(IOException e)
	    {
	    	System.out.println("exception is "+e);
	    }	
	    }


	}
