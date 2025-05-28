class RecurssionMethodSumOfDigit
{
	public static void main (String [] args)
	{
		System.out.println(sumOfDigit(12234 ,0));
	}
	public static int sumOfDigit(int num , int sum)
	{
		if(num !=0)
		{
			sum = sum + (num%10);
			return sumOfDigit (num/10 , sum);
		}
		return sum;
	}
	
}