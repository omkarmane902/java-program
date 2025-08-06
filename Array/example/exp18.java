//insert value 1st index 

package example;

import java.util.Arrays;

public class exp18 {

	
	public static void main(String[] args) {
		
		
		int [] arr = {20,30,40,50};
		
		int  [] arr1 = new int [arr.length +1];
		
		int element = 10;
		
		arr1[0]=element;
		
		
		for(int i = 0; i<arr.length; i++)
		{
		   arr1[i+1]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
