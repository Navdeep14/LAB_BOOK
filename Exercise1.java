package demo;

public class Exercise1 {
	
	public static void main(String[]args)
	{
		
		int x=10;
		System.out.print(calculateSum(x));
	}
	public static int calculateSum(int n) 
	{ int sum=0;
		for (int i=0;i<=n;i++)
		{
			if (i%3==0||i%5==0)
				sum=sum+i;
		}
		return sum;
	}

}
