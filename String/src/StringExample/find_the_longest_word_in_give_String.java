package StringExample;

public class find_the_longest_word_in_give_String {

	
	 public static void main(String[] args) {
	        
	        String str = "I love programming in Java";
	        
	        
	        String[] words = str.split(" ");
	        
	        String longestWord = "";
	        
	        for(String word : words) {
	            if(word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }
	        
	        System.out.println("Longest word: " + longestWord);
	        System.out.println("Length: " + longestWord.length());
	    }
	 
}
