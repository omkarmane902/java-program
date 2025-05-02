import java.util.Scanner;
class countDigit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		int countDigit = 0;
		while(number> 0)
		{
			number/=10;
			countDigit++;
			
		}
		System.out.println(countDigit);
	}
	
}