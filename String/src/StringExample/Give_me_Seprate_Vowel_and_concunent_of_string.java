package StringExample;

public class Give_me_Seprate_Vowel_and_concunent_of_string {

	
	
	public static void main(String[] args) {
		
		
		String s1 = "omkar mane";
		
		String Vowel = "";
		
		String consonant = "";
		
		
		for(int i = 0 ; i < s1.length(); i++)
		{
			
			char c1 = s1.charAt(i);
			
			if(c1>='a' && c1<='z' || c1>='A' && c1<='Z')
			{
			   if(c1=='A' || c1=='a' || c1=='E'|| c1=='e'||c1=='I'||c1=='i'||c1=='o'||c1=='O'||c1=='u'||c1=='U')
			   {
				   
		           Vowel = Vowel + c1;
			   }
			   else 
			   {
				   consonant = consonant + c1;
			   }
			}
			
		}
		
		
		System.out.println("This is Vowel character : " + Vowel);
		System.out.println("This is consonant character : " + consonant);
		
	}
}
