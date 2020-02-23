package demo;

public class Lab6Exercise8 {
	public static void main(String[]args)
	{
		String x="ant";
		check(x);
	}

	public static void check(String x) {
		int flag=0;
		for (int i=x.length()-1;i>0;i--)
		{
			
			if(x.charAt(i)-x.charAt(i-1)<0)
			{
				flag=1;
			}
		}
		
		if (flag==0)
		{
			System.out.print("its positive string");
		}
		else
		{
			System.out.println("Its not a positive String");
		}
		
		
	}

}
