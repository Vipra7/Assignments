import java.util.Scanner;
public class emp_app{               //App to test class Employee
	static Employee emp[],e;
	public static void main(String[] args){
		int eno;
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter no. of employees:");    
		eno = input.nextInt();                    //Read how many employees?
		emp = new Employee[eno];                  //Array of Employee
		for (int i=0;i<eno;i++){
            emp[i] = new Employee();              //Array object initialization
		}
		for (int i=0;i<eno;i++){
            emp[i].set();                         //Employee array value assign
		}
                                                  //Printing
		System.out.println("\n===================================================================================");
		System.out.println("Emp Name\tYr of Join\tEmp Sal\t\tEmp Address");
		System.out.println("\n===================================================================================");
		for (int i=0;i<eno;i++){
            e=emp[i].get();
            System.out.println(String.format("%-16s%-16s%-16s%s",e.emp_name,Integer.toString(e.yoj),Float.toString(e.emp_sal),e.add.fline));
            System.out.println(String.format("%-48s%s"," ",e.add.sline));
            System.out.println(String.format("%-48s%s"," ",e.add.pin));
		}
	}
	
}

