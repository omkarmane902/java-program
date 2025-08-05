// adding element in array in last index 

package example;

import java.util.Arrays;

public class exp17 {
	
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40};
		
		int  element = 50;
		
		int [] arr1 = new int [arr.length +1];
		
		for(int i = 0 ; i<arr1.length; i++)
		{
			if(i<arr.length)
			{
				arr1[i]=arr[i];
			}
			else
			{
				arr1[i]=element;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
	} 

}
