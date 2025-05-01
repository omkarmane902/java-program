import java.util.Scanner;
class EvenNo
{
  public static void main (String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter you Number");
	  int value = sc.nextInt();
	  
	  while(value>0)
	  {
		  int last= value%10;
		  if(last%2==0)
		  {
			System.out.println(last);  
		  }
		  
		  value = value/10;
		  
	  }
  }
}