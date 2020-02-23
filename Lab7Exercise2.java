package JAVA;

import java.util.*;

public class Lab7Exercise2 
{	
	public static void main(String[]args)
	{
		char [] arr= {'A','P','P','L','E'};
		System.out.println(countCharacter(arr));
	}
	private static Map countCharacter(char [] arr) 
	{
		
		Map map=new HashMap();
		for( char c='A'; c<='Z'; c++) {
			int count=0;
			   for( char x : arr ) {
			        if( c == x ) {
			          count++;
			        }
			   }if (count!=0)
			   map.put(c,count);
			  
			}
		
		return map;
	}
    	
}
