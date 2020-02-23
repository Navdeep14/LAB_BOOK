package JAVA;

import java.time.*;
import java.util.*;

public class Lab7Exercise6 {

	public static void main(String[]args)
	{
		HashMap map=new HashMap();
		map.put(1,"12/11/2018");
		map.put(2,"01/01/2000");
		map.put(3,"05/05/1998");
		System.out.println(votersList(map));
	}

	private static List votersList(HashMap map) 
	{
		
		Collection l=map.keySet();
		List list=new ArrayList(l);
		List list2=new ArrayList(l);
		Date date=new Date();
		String s=date.toString();	
		String []arr=s.split(" ");
		String sysdate="";
		sysdate=sysdate+arr[2]+" "+arr[1]+" "+arr[5];
		System.out.println(sysdate);
		return list;
		
	}
}
