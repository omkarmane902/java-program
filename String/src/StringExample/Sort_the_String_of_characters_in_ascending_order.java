package StringExample;

import java.util.Arrays;

public class Sort_the_String_of_characters_in_ascending_order {

	
	public static void main(String[] args) {
		
		String s1 = "omkar mane";
		
		char [] arr = s1.toCharArray();
		
		
		Arrays.sort(arr);
		
	   
		String ans = new String(arr);
		
		
		
		 System.out.println("Original String: " + s1);
	     System.out.println("Sorted String: " + ans);
		
		
	}
}
