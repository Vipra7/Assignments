import java.util.*;
class Fourth
{  
public static void main(String[] args) 
{ 
    int i,n,multi=1,t=1,x;
    Scanner  entries = new Scanner(System.in);
        System.out.print("Enter a base: ");
        x= entries.nextInt();
        System.out.print("Enter the value of n : ");
        n= entries.nextInt();

    
    for (i = 1; i <= n; i++)  
    { 
        t = t + multi / i; 
        multi = multi * x; 
    } 
    
     System.out.printf("the sum is " +t); 

} 
}
  

    