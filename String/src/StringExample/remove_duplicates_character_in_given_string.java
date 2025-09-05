package StringExample;

public class remove_duplicates_character_in_given_string {

	
	public static void main(String[] args) {
		
		
		
		String s1 = "java";
		
		String ans = "ja";
		
		
		
		for(int i = 0 ; i < s1.length(); i++)
		{
			
		char ch = s1.charAt(i);
		
		
		if(ans.indexOf(ch) == -1) 
		{
			ans += ch;
		}
		
			
		}
		
		System.out.println(ans);
		
	
		
		
	}
}
