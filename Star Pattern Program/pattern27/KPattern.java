class KPattern 
{
    public static void main(String[] args) 
	{
        int n = 5;

        // Top half (inverted triangle)
        for (int i = n; i >= 1; i--) 
		{
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half (normal triangle)
        for (int i = 2; i <= n; i++) 
		{
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
