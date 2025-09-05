package StringExample;

public class Check_String_is_Palindrome_Or_Not {
	
	
	
	public static void main(String[] args) {
		
		
		
		String S1 = "madam";
		
		
		String rev = "";
		
		
		for (int i = S1.length()-1; i >= 0; i--) {
			
			char ch = S1.charAt(i);
			
			rev += ch;
		}
		
		
		if(S1.equals(rev))
		{
			System.out.println("Given String is Palindrome" ); 
			
		}
		else
		{
			System.out.println("Given String is Not Palindrome" ); 
		}
	}

}
