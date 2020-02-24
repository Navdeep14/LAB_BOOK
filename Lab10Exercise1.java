package JAVA;

interface Power{
	void power(int x ,int y);
}

public class Lab10Exercise1 {
	public static void main(String[]args)
	{
		
	 Power fobj = (x,y)->System.out.println(Math.pow(x,y));	 
     fobj.power(5,6);
     
	}
}
