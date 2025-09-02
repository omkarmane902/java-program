package StringExample;



public class String_convert_into_upercase_without_useing_inbuilt_function {

	public static void main(String[] args) {
		
		String s1 = "omkar mane";
		
		System.out.println(upercase(s1));
		
	}
	
	public static String upercase(String s1)
	{
		
		String ans = "";
		
		for(int i = 0 ; i <s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='a' && ch<='z' )
			{
			   	ans = ans + (char)+(ch-32);
			}
			else
			{
				ans = ans +ch;
			}
		}
		
		return ans;
	}
	
	
	
}
