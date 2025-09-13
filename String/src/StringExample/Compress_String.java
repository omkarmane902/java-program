// String s = "aaaabbcccddddmzzzzzz";
// String ans ="a4b2c3d4m1z6";

package StringExample;


public class Compress_String {

	public static void main(String[] args) {
		
		String s = "aaaabbcccddddmzzzzzz";
		
		System.out.println(compress(s));
	}
	
	
	
	
	public static String  compress(String s)
	{
	   String ans = "";
	   
	   int count = 1;
	   
	   for (int i = 0 , j = i + 1; i < s.length();) {
		   
		   if(j<s.length() && s.charAt(i)==s.charAt(j))
		   {
			   count ++;
			   j++;
			   i++;
		   }
		   else
		   {
			   ans += s.charAt(i);
			   
			   ans += count;
			   
			   
			   
			   
			   i = j;
			   count = 1;
			   j = i + 1;
		   }
		   
		
	   }
	   return ans;
	}
   
}
