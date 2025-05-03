import java.util.Scanner;
class sumOfEvenAndProductOfOdd 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Number");
		int number = sc.nextInt();
		 
		int sum = 0;
		int product = 1;
		
		while (number !=0)
		{
			if(number%2==0)
			{
				sum = sum + (number%10);
			}
			else
			{
				product = product * (number%10);
			}
			number /=10;
		}
		System.out.println("Sum of Even Number :"+sum);
		System.out.println("Product Of Odd Number :" +product);
	}
}
