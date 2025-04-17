//amount is more than 5000 then apply coupon
import java.util.Scanner;

class if3 
{
	public static void main (String[]args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your bill amount");
	double amount = sc.nextDouble();
	
	if(amount>5000){
		amount = amount - (amount*0.1);
		System.out.println("discount applied");
	}
	System.out.println("Grand total:"+amount);
	}
}