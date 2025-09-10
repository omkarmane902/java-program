package StringExample;

import java.util.Arrays;




public class Anagram {

	
	
	public static void main(String[] args) {
		
		
		
		String s1 = "CAT";
		
		String s2 = "ACT";
		
		

		if (isAnagram(s1,s2)) 
		{
			System.out.println("This String is Anagram");
		} 
		else 
		{
			System.out.println("This String is Not Anagram");
		}
		
		
		
	}
	
	
       	public static  boolean isAnagram (String s1,String s2) 	
       	{
       		
       		s1.toUpperCase();
       		
       		s2.toUpperCase();
       		
       		char [] arr1 = s1.toCharArray();
    		
    		char [] arr2 = s1.toCharArray();
    		
    		
    		
    		
    		
    		
    		Arrays.sort(arr1);
    		
    		Arrays.sort(arr2);
    		
    		
    		
    		
    		boolean ans = Arrays.equals(arr1, arr2);
    		
    		
    		return ans;
       	}	
	
	
	
	
	
	
	
}




