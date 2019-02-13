import java.util.*;
class Stack{
  Scanner in = new Scanner(System.in);
  int i=0;
  int index=0;
  int array[] = new int[10];
  void push(){
    for(i=0;i<array.length;i++){
      System.out.println("Please enter element "+(i+1));
      array[i] = in.nextInt();
    }
  }
    void pop(){
      index=array.length;
      index=i-1;
      for(i=0;i<index;i++){
      System.out.println(array[i]);
    }
  }
      void isEmpty(){
        for(i=array.length-1;i>0;i--){
          if(i==0){
            System.out.println("Stack is empty");
          }
        }
      }
      void isFull(){
        if(i==array.length){
          System.out.println("Stack is full");
        }
      }
      void Spaceleft(){
        if(index>=0 && index<9){
          System.out.println("Space is left in the stack");
        }
      }
}

import java.util.*;
class StackTest{
  
  public static void main(String [] args){

    char c;
    Stack s = new Stack();
    Scanner scan = new Scanner(System.in);
    do{
    System.out.println("You can perform following operations on Stack");
    System.out.println("1. Push an element into the Stack");
    System.out.println("2. Pop an element from the Stack");
    System.out.println("3. Find out if the Stack is Empty");
    System.out.println("4. Find out if the Stack is Full");
    System.out.println("5. Space left in the Stack");
    System.out.print("\n"+"Enter Your Choice : ");
    int ch=scan.nextInt();
    switch(ch){
      case 1 : System.out.print("Enter the number you want to push : ");
           int num =scan.nextInt();
           s.push(num);
           break;
      case 2: System.out.println("The poped number is : "+s.pop());
           break;
      case 3: System.out.println(s.isEmpty());
           break;
      case 4 : System.out.println(s.isFull());
           break; 
      case 5 : System.out.println("Space for"+s.SpaceLeft()+"numbers left in Stack");
           break; 
      default : System.out.println("Invalid Choice");
            
                 
      }
    s.display();
    System.out.println("Do you want to continue");
    c =scan.next().charAt(0);        
    }while(c=='y'||c=='Y');
  
  }
}