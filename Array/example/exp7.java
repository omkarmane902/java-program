//  1 array copy into second array 

package example;

import java.util.Arrays;

public class exp7 {
 public static void main(String[] args) 
 {
	
	 
	 int [] arr = {10,20,30,40,50,60};
	 
	 int [] temp = new int [arr.length];
	 
	 for(int i = 0; i <arr.length; i++)
	 {
		 temp[i] = arr[i];
	 }
	 System.out.println(Arrays.toString(temp));
 }
}
