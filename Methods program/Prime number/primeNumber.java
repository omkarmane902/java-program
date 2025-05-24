// Prime numbers are numbers that have only 2 factors: 1 and themselves. 

class primeNumber
{
	public static void main(String [] args)
	{
	   prime(43);	
	   prime(15);
	}
	public static void prime(int num)
	{
		int den = 2;
		while(num > den)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (num==den)
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("it is not prime");
		}
	}
}