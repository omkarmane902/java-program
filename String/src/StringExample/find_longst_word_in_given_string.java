package StringExample;



public class find_longst_word_in_given_string {

	
	
	public static void main(String[] args) {
		
		String s = "Java is a powerful programming language";
		
		
		System.out.println("Longst word in given string is  : " +(longstWord(s)) );
		
	}
	
	
	public static String longstWord(String s)
	{
	    
		
		String [] words = s.split(" ");
		
		String longstWord = "";
		
		
		for(int i = 0 ; i <words.length; i++)
		{
		  if( words[i].length() >longstWord.length())
		  {
			   longstWord = words[i];
		  }
			
		}
		
		return longstWord;
		
		
	}
}
