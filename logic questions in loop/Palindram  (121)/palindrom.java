import java.util.Scanner;
class palindrom
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int inputNumberSave = number;
		int reversNumber = 0;
		
		while (number != 0)
		{
			reversNumber = reversNumber * 10 +(number%10);
			number /=10;
		}
		if (inputNumberSave == reversNumber)
		{
			System.out.println("This is palindrom number ");
		}
		else
		{
		System.out.println("This is not palindrom number ");	
		}
	}
}