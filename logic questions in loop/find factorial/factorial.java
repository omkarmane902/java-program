import java.util.Scanner;
class factorial
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int product = 1;
		
		while (number>0) 
		{
			product = product * number ;
			number--;
		}
	    System.out.println("Factorial is : " +product);
	}
}
