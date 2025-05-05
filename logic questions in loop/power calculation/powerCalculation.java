import java.util.Scanner;
class powerCalculation
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		int base = sc.nextInt(); 
		System.out.println("enter the raise");
		int raise = sc.nextInt();
		
		int product = 1;
		for(int time = 0; time < raise; time++)
		{
			product =  product * base ;
			
		}
		System.out.println("the Power of "+base+ " ^ " +raise+ " is : " +product);
	}
}
