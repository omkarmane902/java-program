import java.util.Scanner;
class sumDigit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int value = sc.nextInt();
		int sum = 0;
		
		while(value!=0)
		{
			sum = sum + (value%10);
			value/=10;
		}
		System.out.println("Sum of all Digit :"+sum);
	}
}
