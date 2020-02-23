package demo;
import java.io.*;
public class Lab6Exercise7 {



public static void main(String args[])
{
	String file="C:\\Users\\LNCTE\\Documents\\MATLAB";
File f=new File(file);
System.out.println("name :"+f.getName());
System.out.println("path:"+f.getAbsolutePath());
System.out.println("exists:"+f.exists());
System.out.println("is file:"+f.isFile());
System.out.println("is dir:"+f.isDirectory());
System.out.println("readable :"+f.canRead());
System.out.println("writable:"+f.canWrite());


}
}

