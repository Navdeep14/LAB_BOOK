package demo;

public class Exercise2 {
	
	public static void main(String []args) {
		
		int x=10;
		System.out.print(calculateDifference(x));
		
	}
	public static int calculateDifference(int n)
	{int square=0,sum=0;
	
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
		
		for(int i=0;i<n;i++)
		{
			square=square+(i*i);
		}
		
		return (square-sum);
	}
}
