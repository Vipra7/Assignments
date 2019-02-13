import java.util.Scanner;
class Fifth
{
    public static void main(String args[ ])
    {
    int i=0;
    Scanner b=new Scanner(System.in);
    System.out.println("Enter the character : ");
    char ch;
    ch= b.next().charAt(0);    
    switch(ch)
    {
     case  'a' :
     case 'e'  :
     case 'i'  :
     case 'o'  :
     case 'u'  :
     case  'A' :
     case 'E'  :
     case 'I'  :
     case 'O'  :
     case 'U'  :
     i++;
    }
    if(i==1)
    System.out.println("Entered character "+ch+" is  Vowel");
    else 
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
        System.out.println("character entered "+ch+"is consonant");
        else
        System.out.println("Not an alphabet");      
    }
}