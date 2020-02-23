package demo;

public class Lab6Exercise5 {
	public static void main(String[]args)
	{
	int x=45862;
	System.out.println(modifyNumber(x));
	
	}

	public static StringBuffer modifyNumber(int x) {
		
		StringBuffer y=new StringBuffer();
		String z=Integer.toString(x);
		for(int i=0;i<z.length();i++)
		{
			if(i==z.length()-1)
			{
				y=y.append(Math.abs(z.charAt(i)-z.charAt(0)));
			}
			else {
			y=y.append(Math.abs(z.charAt(i+1)-z.charAt(i)));
			}
		}
		
		return y;
	}

}
