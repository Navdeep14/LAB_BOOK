package demo;
import java.util.Arrays;
public class Lab3Exercise2 {

		public static void main(String []args) {
			String array[]= {"navdeep","tripathi"};
			
			
			sort(array);
			
			if(array.length%2==0) {
				for(int i=0;i<array.length/2;i++) {
					array[i]=array[i].toUpperCase();
			
				}
				for(int i=array.length/2;i<array.length/2;i++) {
					array[i]=array[i].toLowerCase();
			
				}
				
				
				System.out.print(Arrays.toString(array));
		}
			
			else {
				for(int i=0;i<(array.length/2)+1;i++) {
					array[i]=array[i].toUpperCase();
			
				}
				for(int i=(array.length/2)+1;i<array.length;i++) {
					array[i]=array[i].toLowerCase();
			
				}
				
				
				System.out.print(Arrays.toString(array));
		}
			
		}
		static String[] sort(String arr[])
		{
			Arrays.sort(arr);
			return arr;
		}
		
	}

	

