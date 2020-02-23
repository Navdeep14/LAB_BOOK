package demo;
//define package according to question
import java.util.Scanner;

public class Lab5Exercise6 {
	
	public static void main(String []args) throws EmployeeException
	{
		Scanner in=new Scanner (System.in);
		int salary;
		System.out.print("enter the Salary");
		salary=in.nextInt();
		
		
		
		if (salary<3000)
		{
			EmployeeException exception =new EmployeeException("Salary is below 3000");
			throw exception;
		}
		else
		System.out.println("The salary is "+salary);
		
		
		
		
	}

}
