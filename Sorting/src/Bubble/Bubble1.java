package Bubble;

import java.util.Arrays;

public class Bubble1 {
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,30,4,29,45,89};
		
		
		Bubble11(arr);
		
	}
	
	
	
 public static void  Bubble11 (int [] arr) {
	 int j ;

	 	 //time complexity = O(n²).
	 
	 for(int i = 0 ; i < arr.length-1; i++ )
	 {
		for(j = 0 ; j < arr.length-i-1; j++)
		{
		    
			if(arr[j] < arr[j+1])
			{

				//swap
				int temp = arr[j];
				
				arr[j] = arr[j+1];
				
				arr[j+1] = temp;
			}
		}
	 }
	 
	 System.out.println(Arrays.toString(arr));
	 
	 
}

}

