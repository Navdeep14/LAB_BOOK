package demo;
import java.util.*;
public class Lab5Exercise3 {
	private static Scanner in;

	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       in = new Scanner(System.in);
	       System.out.print("Enter the range you want prime numbers");
	       int x=in.nextInt();
	       String  primeNumbers = "";

	       for (i = 1; i <= x; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+x+" are :");
	       System.out.println(primeNumbers);
	   }

}
