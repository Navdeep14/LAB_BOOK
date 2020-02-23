package demo;
import java.util.*;
public class Lab5Exercise21 {
	
	 private static Scanner in;

	static int fib(int n) 
	    { 
	        int a = 0, b = 1, c; 
	        if (n == 0) 
	            return a; 
	        for (int i = 2; i <= n; i++) 
	        { 
	            c = a + b; 
	            a = b; 
	            b = c; 
	        } 
	        return b; 
	    } 
	  
	    public static void main (String args[]) 
	    { in = new Scanner(System.in);
	    System.out.print("Enter the number");
	        int n = in.nextInt(); 
	        System.out.println(fib(n)); 
	    } 

}
