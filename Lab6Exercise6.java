package demo;

import java.util.*;

public class Lab6Exercise6 {

	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		System.out.print("enter the String text");
		String x=in.nextLine();
		displaychlw(x);
	}

	public static void displaychlw(String x) {
		int ch=0;int l=1;int w=0;
		for (int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				ch=ch+1;
			}
			else
			{
				w=w+1;
			}
			if(x.charAt(i)=='\n'){
				l=l+1;
			}
		}
		System.out.print("number of characters="+ch);
		System.out.print("number of words="+(w+1));
		System.out.print("number of lines="+l);
		
	}
}
