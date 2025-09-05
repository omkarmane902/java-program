package StringExample;



public class find_substring_in_given_String {


public static void main(String[] args) {
	
	String s1 = "omkar mane is good boy";
 
	System.out.println(substring(s1, 1, 6));
 
 
	
	}

public static String substring(String s1 , int start , int end)
  	{
    
	String substringAns = "";
	   
	for( int i = start ; i < end; i++)
	   	{
		substringAns += s1.charAt(i) ;
	   	}
	   
	   	return substringAns;
	   
  }

	
}
