class  pattern16										
{
	public static void main (String [] args)
	{
		int n = 11;
		int star = 1;
		
        for(int i = 0; i<n; i++ )
        {
			for(int j = 0; j<star; j++)
			{
			    System.out.print("*"+" ");	
			}
			System.out.println();
		 
		 if(i<n/2)
		 {
			 star++;
		 }
		 else
		 {
			 star--;
		 }
		}		
		 
	}
}