import java.util.Scanner;
class primeNo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int count =0;
		
		for(int i=1; i<=number; i++ )
		{
			
			if  (number%i == 0)
			{
				count++;
			}
		}
		 
		if(count==2)
		{
			System.out.println("prime no");
		}
		else
		{
		    System.out.println("not prime no");	
		}
	}
}