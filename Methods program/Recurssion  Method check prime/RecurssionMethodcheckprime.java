class RecurssionMethodcheckprime
{
	public static void main (String [] args)
	{
		System.out.println(checkprime(11 , 2));
	}
	public static boolean checkprime (int num , int den)
	{
		if (den < num)
		{
			if (num%den == 0)
			{
				return false;
			}
			else
			{
				return checkprime (num , den+1);
			}
		}
		else if (num==den)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}