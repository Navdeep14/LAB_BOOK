package demo;

public class Lab6Exercise10 {
	
	public static void main(String[]args)
	{
		String x="police_job";
		System.out.println(validate(x));
		
	}

	public static boolean validate(String x) {
		if (x.length()<8)
		{
			 return false;
		}
		else if(!x.contains("_job"))
				{
			return false;
				}
		else 
			return true;
		
	}

}
