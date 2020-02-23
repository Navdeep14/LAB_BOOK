package JAVA;

import java.util.*;

public class Lab7Exercise4 {

	public static void main(String[]args)
	{
		HashMap map=new HashMap();
		map.put(80,"Navdeep");
		map.put(90,"Anirudh");
		map.put(70,"Krishna");
		System.out.println(getStudents(map));
	}

	private static HashMap getStudents(HashMap map) {
		int i=0;
		HashMap mp=new HashMap();
		Collection list=map.keySet();
		for(Object k: list)
		{
			String s="";
			if ((int)k>=90)
			{
				s=s+"Gold "+map.get((int)k);
				i++;
			}
			else if ((int)k>=80)
			{
				s=s+"Silver "+map.get((int)k);
				i++;
			}
			else
			{
				s=s+"Bronze "+map.get((int)k);
				i++;
			}
			
			mp.put(i,s);
		}
		return mp;
			
	}
}
