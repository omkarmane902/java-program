class methodWithReturns
{
	public static void main (String[] args)
	{
	 int ans = sumofdigit(1234);
     System.out.println(ans);
	 
	  // or declaration method
	  
	  System.out.println(sumofdigit(32142));
	 
	}
	public static int sumofdigit(int digit)
	{
		int sum = 0;
		
		while (digit!=0)
		{
			sum = sum + (digit%10);
			digit/=10;
		}
		return sum;
	}
	
}