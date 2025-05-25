class palindromicPrime
{
	public static void main (String [] args)
	{
	  if (palindromicno(131) && primeno(131))
	  {
		System.out.println("It is palindromicPrime number");  
	  }
	  else
		  {
			System.out.println("It is not palindromicPrime number");  
		  }  
	}
	public static boolean palindromicno(int num)
	{
    int originalNumber = num;
    int rev = 0;

    while (num != 0)
		{
        rev = rev * 10 + (num % 10);
        num /= 10;
    }

    return originalNumber == rev;
}

	public static boolean primeno(int num) 
	{
    if (num < 2) return false;

    for (int den = 2; den < num; den++) 
	{
        if (num % den == 0) 
		{
            return false;  
        }
    }
    return true;  
  }
 }
		