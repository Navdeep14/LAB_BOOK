package JAVA;

import java.util.*;

public class Lab7Exercise3 {

	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		
		List list=new ArrayList();
		
		list.add(1);list.add(4);list.add(2);list.add(3);list.add(5);list.add(6);list.add(7);
		
		
		int []arr=new int [list.size()];
		
		for(int i =0;i<list.size();i++)
		{
			arr[i]=(int) list.get(i);
		}
		System.out.println(getSquares(arr));
	}

	private static Map getSquares
(int [] arr) {
		Map map=new HashMap<>();
		
	List list=new ArrayList();
	for (int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
	}
	
	for (int j=0;j<arr.length;j++)
	{
		map.put(arr[j],arr[j]*arr[j]);
	}
		return map;
	}
}
