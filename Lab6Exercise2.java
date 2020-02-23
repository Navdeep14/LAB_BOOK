package demo;



import java.io.*;


public class Lab6Exercise2 {

	public static void main(String []args)
	{
		Lab6Exercise2 iii=new Lab6Exercise2();
		iii.execute();
		
	}
	void execute()
	
	{
		String inputpath="C:/Users/LNCTE/Documents/MATLAB/gg.txt";
		File inputFile=new File(inputpath);
		String outputpath="C:/Users/LNCTE/Documents/MATLAB/g1.txt";
		File outFile=new File(outputpath);
		try(
				FileReader reader=new FileReader(inputFile);
				BufferedReader bufferedReader=new BufferedReader(reader);
				Writer writer=new FileWriter(outFile);
				BufferedWriter bufferedWriter=new BufferedWriter(writer);
				
				
				
				
				) {
			
		    
			String readLine;
			
			int i=0;
			while((readLine=bufferedReader.readLine())!=null)
			{
				
				bufferedWriter.write(readLine+"\r\n");//bufferedWriter.newLine() this will do the same
				i++;
				System.out.println(i+readLine);
				
			}
			bufferedWriter.flush();
			
			System.out.print("file created and written successfully");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();

		}
		
		
	}
}
