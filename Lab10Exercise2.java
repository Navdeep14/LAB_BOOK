package JAVA;

interface Power1{
	void power(String x);
}

public class Lab10Exercise2 {
	public static void main(String[]args)
	{
	 Power1 fobj = (x)->System.out.println(x.replace("", " ").trim());
	 fobj.power("NAVDEEP");
     }
}