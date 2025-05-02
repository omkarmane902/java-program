import java.util.Scanner;
class countOfoddANDeven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int value = sc.nextInt();
		
		int even = 0;
		int odd = 0;
		
		while(value>0)
		{
			int last = value%10;
			if(last%2==0)
			{
				even++;
			}
			else 
			{
				odd++;
			}
			value/=10;
			System.out.print("Count of even no :"+even+"  ");
			System.out.print("Count of odd no :"+odd);
		}
	}
}