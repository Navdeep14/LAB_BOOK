package demo;

import java.util.Scanner;

public class Lab5Exercise5 {
	
	public static void main(String []args) throws AgeBelow15Exception
	{
		Scanner in=new Scanner (System.in);
		int age;
		System.out.print("enter the age");
		age=in.nextInt();
		
		
		
		if (age<=15)
		{
			AgeBelow15Exception exception =new AgeBelow15Exception("first or last name is empty");
			throw exception;
		}
		else
		System.out.println("The Age is "+age);
		
		
		
		
	}

}
