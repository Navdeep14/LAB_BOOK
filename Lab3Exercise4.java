package demo;
import java.util.*;  
public class Lab3Exercise4 {
	
		public static void main(String []args) {
			char array[]= {'a','b','a','c','a','d','b'};
			charactercount(array);
		}
		static void charactercount(char arr[])
		{
			ArrayList<String> al=new ArrayList<String>();
			for(int i=0;i<arr.length;i++)
			{int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if (arr[i]==arr[j]) 
				{
				count++;
				}
			}
			String s="character "+arr[i]+" occured "+count+" number of times.";
			if (!al.contains(s))
			{
			al.add(s);
			}
			}
			
			for (String j:al) {
				System.out.println(j);
			}
			
		}
		
}

	
	
