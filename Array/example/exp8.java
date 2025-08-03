// copy the elements from one array to another array but in reverse
package example;

import java.util.Arrays;

public class exp8 {
	
	
 public static void main(String[] args) {
	
	 
	 int [] arr = {10,20,30,40,50,60};
	 
	 int [] temp = new int[arr.length];
	 
	 for (int i = 0; i < temp.length; i++) {
		
		 temp[temp.length-1-i] = arr[i]; 
	}
	 
	 System.out.println(Arrays.toString(temp));
}
}
