package demo;

public class Lab6Exercise4 {
	
	public static void main(String[]args)
	{
		
		String x="JAVA";
		System.out.print(alterString(x));
	}
	public static String alterString(String n) 
	{ 
		String x="";
		for (int i=0;i<n.length();i++)
		{
			 if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u' || 
					 n.charAt(i)=='A' || n.charAt(i)=='E' || n.charAt(i)=='I' || n.charAt(i)=='O' || n.charAt(i)=='U')
			 {
				 x=x+n.charAt(i);
			 }
			 else
			 {
				 x=x+(char)(n.charAt(i)+1);
			 }
		}
		return x;
		
	}

}
