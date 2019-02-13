
import java.util.Scanner;
class Employee{
	String emp_name;       
	int yoj;
	float emp_sal;
	Address add;           //Address object
	Employee(){            //Employee object initialization
		emp_name="";
		yoj=0;
		emp_sal=0.0f;
		add=new Address("","","");        //Address object initialization
	}
	Employee(String nm, int yj, float sal, Address ad){    //Parameterized constructor
		emp_name=nm;
		yoj=yj;
		emp_sal=sal;
		add=ad;
	}
	void set(){                                    //write employee object value
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter employee name:");
		this.emp_name = input.next();
		System.out.print("\nEnter employee year of joining:");
		this.yoj = input.nextInt();
		System.out.print("\nEnter employee salary:");
		this.emp_sal = input.nextFloat();
		System.out.print("\nEnter employee address (first line):");
		this.add.fline = input.next();
		System.out.print("\nEnter employee address (second line):");
		this.add.sline = input.next();
		System.out.print("\nEnter employee address (pin code):");
		this.add.pin = input.next();
	}
	Employee get(){                        //read employee object value
		return this;
	}
}
class Address{                          //Class Adress declaration
	String fline;
	String sline;
	String pin;
	Address(String l,String s, String p){
        this.fline=l;
        this.sline=s;
        this.pin=p;
    }
}
