package StringExample;



public class only_find_the_number_in_given_string {

	
	public static void main(String[] args) 
	{
		
		String s1 = "om12kar4 3ma8ne23";
		
		int num = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			
			char ch = s1.charAt(i);
			
			
			if(ch >= '0' && ch <= '9' )
			{
				num = num * 10 + (ch - 48);
			}
		}
		System.out.println(num);
	}
	
	
}
