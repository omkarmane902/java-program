import java.util.Scanner;
class reversDigit 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int value = sc.nextInt();
		
	while(value>0)
	{
		int last = value%10;  //extract last value
		System.out.println(last); //print last digit
		value =value/10;
	}
	}
}
