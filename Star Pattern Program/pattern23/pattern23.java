class pattern23
{
	public static void main (String [] args)
	{
		int n = 5;
		int count = 1;
		char ch = 'a';
		
		for(int i = 1; i<n; i++)
		{
			for(int j = 1; j<n ; j++)
			{
				if(j%2==0)
				{
					System.out.print((count++)+" ");
				}
				else
				{
					System.out.print((ch++)+" ");
				}
			}
			System.out.println();
		}
	}
}