class PowerNumber 
{
    public static void main(String[] args)
	{
        power(2, 3);
    }

    public static void power(int base, int raise) 
	{
        int pow = 1;
        for (int i = 1; i <= raise; i++) 
		{
            pow = pow * base;
        }
        System.out.println(pow);
    }
}
