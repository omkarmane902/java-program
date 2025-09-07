package StringExample;

public class count_of_words_of_given_string {

	public static void main(String[] args) {
		
		
		String s1 = " omkar mane is good boy ";
		
		s1 = s1.trim();
		
		String [] arr = s1.split(" ");
		
		System.err.println("count of words of given string  is : " +arr.length);
	}
}
