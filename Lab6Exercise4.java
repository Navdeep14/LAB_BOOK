package JAVA;

public class Lab6Exercise4 {
public static void main(String[] args) {
	String s="JAVA";
	System.out.println(alterString(s));
}
public  static String alterString(String s) {
	String x = "";
	for(int i=0;i<s.length();i++) {
		
		char ch;
		ch=s.charAt(i);
		{
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&
				ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
			x=x+(char)(ch+1);
			
		}
		
		else {
	    x=x+ch;
		}
		
			
	}
		
			

	
			
}
return x;
}

}