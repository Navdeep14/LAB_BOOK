package demo;



public class Lab4 {
	
	public static void main(String []args) {
		int ab= 15;
		System.out.print(digitsumcube(ab));
	}
	static int digitsumcube(int ar)
	
	{
		int cs=0,dig;
		while(ar>0)
		{
			dig=ar%10;
			ar=ar/10;
			cs=cs+(dig*dig*dig);
			
		}
		
	
		return cs;
	}
	

}
