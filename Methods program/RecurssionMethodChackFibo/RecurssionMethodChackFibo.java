class RecurssionMethodChackFibo
{
	public static void main (String[] args)
	{
	   System.out.println(chackFibo (34 ,0,1));	
	}
	public static boolean chackFibo (int num , int n , int n1)
	{
		if (n1 > num)
		{
			return false;
		}
		else if(num == n1)
		{
			return true;
		}
		else 
		{
			return chackFibo (num , n1 , n+n1);
		}
	}
}