package StringExample;

public class Panagram {

	public static void main(String[] args) {
		
		String s1 = "The quick brown fox jumps over the lazy dog ";
		
		if(isPanagram(s1))
		{
			System.out.println("This String is panagram");
		}
		else 
		{
			System.out.println("This String is not panagram");
		}
	}
	
	
	public static boolean isPanagram(String s1) {
		
		
		 s1  = s1.toLowerCase();
		
		
		for(char i = 'a' ; i<='z'; i++)
		{
			if(s1.indexOf(i)== -1)
			{
			  return false;
			}
				
				
			}
		 return true; 
		}
		
	 }	
	


