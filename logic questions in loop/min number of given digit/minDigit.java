import java.util.Scanner;
class minDigit
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Number");
		int Number = sc.nextInt();
		
	    int min = 9;
		
		while(Number>0)
		{
			int last = Number %10;
			if (last<min)
			{
			   min=last;	
			}
			Number /=10;
		}
		System.out.println("Min digit is :"+min);
	}
}