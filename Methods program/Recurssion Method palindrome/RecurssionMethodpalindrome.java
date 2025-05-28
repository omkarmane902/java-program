class RecurssionMethodpalindrome
{
	public static void main (String [] args)
	{
	  System.out.println(palindrome(101 ,0,101));
	}
	public static boolean palindrome(int num , int rev , int temp)
	{
		if (num !=0)
		{
			rev = rev * 10 + (num%10);
			return palindrome(num/10,rev,temp);
		}
		return temp==rev ;
		
	}
}