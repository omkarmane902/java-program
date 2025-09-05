package StringExample;

public class sentence_is_right_order_but_word_reverce {
  
	
	public static void main(String[] args) {
		
		String s1 = "omkar is a java developer";
		
		System.out.println(reverceWord(s1));
		
	}
	
	public static String reverceWord(String s1)
	{
		String [] words = s1.split(" ");
		String  ans = "";
		
		
		for (int i = 0; i < words.length; i++) {
			
		String word = words[i];	
		
		String revwords = "";
		
		for (int j = word.length()-1; j >= 0; j--) {
			
			revwords += word.charAt(j);
		}
		
		 
		ans += revwords + " ";
		
		}
		return ans.trim();
		
	}
}
