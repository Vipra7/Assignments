import java.util.*;
class Employee
{
	String firstName,lastName;
	Double monthlySalary;

	Employee(String firstName,String lastName,Double monthlySalary)
	{
       this.firstName=firstName;
       this.lastName=lastName;
       this.monthlySalary=monthlySalary;

	}

       String getFirstName()
	{
       return  firstName;

     } 

     String getLastNames()
     { 
       return  lastName;
   }

     Double getMonthlySalary()
     {
       return  monthlySalary;

       }	


	void set(String firstName,String lastName,Double monthlySalary)
	{
       this.firstName=firstName;
       this.lastName=lastName;
       this.monthlySalary=monthlySalary;

	}


	Employee()
	{
	firstName="Rohan";
	lastName="Sharma";
	monthlySalary=50000.0;
	}

	Double yearlySalary(Double monthlySalary)
	{
       return (12*monthlySalary);
	}

	Double raiseInSalary(Double monthlySalary)
	{
	 this.monthlySalary=monthlySalary;
	  return 12*(((10*monthlySalary)/100)+monthlySalary);

	}
	void displayEmployeeInformation(){
		System.out.println("Employee Name : " + firstName + " " + lastName);
		System.out.println("Employee Monthly Salary : " + monthlySalary);
		System.out.println("Employee Yearly Salary : " + yearlySalary(monthlySalary));
		System.out.println("Employee raised Salary : " + raiseInSalary(monthlySalary));

}

}

class EmployeeDriver{

    static Scanner input = new Scanner(System.in);
    public static void main(String args[])
    
    {
     String firstName;
		String lastName;
		Double monthlySalary;
		Double raisePerceent;
        
        System.out.println("enter FirstName,LastName,MonthlySalary");
        firstName=input.nextLine();
        lastName=input.nextLine();
        monthlySalary=input.nextDouble();

        Employee emp1= new Employee();
        emp1.set(firstName,lastName, monthlySalary);

        emp1.displayEmployeeInformation();
        
        Employee emp2= new Employee();
         emp2.set( firstName, lastName, monthlySalary);

        emp2.displayEmployeeInformation();
        
    }
    }