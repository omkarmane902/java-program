package StringExample;



public class Reverse_string {

	
	
	public static void main(String[] args) {
		
		
		
		String s1 = "omkar mane";
		
		
		String Reverse = "";
		
		
		for(int i = s1.length()-1;  i >= 0 ; i--)
		{
		    Reverse = Reverse + s1.charAt(i);
		    		
		}
		
		System.out.println(Reverse);
			
		}
	}

