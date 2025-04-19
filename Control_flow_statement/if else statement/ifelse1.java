import java.util.Scanner;

class ifelse1
{
	public static void main (String[]args)
	{
	Scanner sc =new Scanner(System.in);
    System.out.println("Enter You age ");
    int age = sc.nextInt();
    
     if(age<18)
     {
	  System.out.println("you are not eligible to vote");	 
	 }
    else
	{
		System.out.println("you are eligible to vote");
	}		
	}
}