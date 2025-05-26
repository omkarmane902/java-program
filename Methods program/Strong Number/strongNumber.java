class StrongNumber 
{
   public static int factorial(int n) 
	{
        int fact = 1;
        for (int i = 1; i <= n; i++) 
		{
            fact = fact * i;
        }
        return fact;
    }

    
   public static boolean isStrong(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        return sum == num;
    }

    
    public static void main(String[] args)
	{
        int number = 145; 

        if (isStrong(number)) 
		{
            System.out.println(number + " is a Strong Number");
        } else 
		{
            System.out.println(number + " is NOT a Strong Number");
        }
    }
}
