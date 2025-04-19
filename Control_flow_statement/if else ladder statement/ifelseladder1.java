import java.util.Scanner;
class ifelseladder1
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ph value :");
		double phvalue = sc.nextDouble();
		
		if(phvalue>=0 && phvalue<=1)
		{
		System.out.println("Battery Acide");	
		}
		else if (phvalue>1 && phvalue<=2)
		{
			System.out.println("Gastric Acide");
		}
		else if (phvalue>=2 && phvalue<=3)
		{
			System.out.println("Drochloric Acide");
		}
		else if (phvalue>3 && phvalue<=4)
		{
			System.out.println("Soda");
		}
		else if (phvalue>4 && phvalue<=5)
		{
			System.out.println("Acide Rain");
		}
		else if (phvalue>5 && phvalue<=6)
		{
			System.out.println("Black Coffee");
		}
		else if (phvalue>6 && phvalue<=7)
		{
			System.out.println("Urine/Saliva");
		}
		else if(phvalue>7 && phvalue<=8)
		{
			System.out.println("Pure Water");
		}
		else if(phvalue>8 && phvalue<=9  )
		{
			System.out.println("Sea Water");
	    }
		else if(phvalue>9 && phvalue<=10)
		{
			System.out.println("Baking Soda");
		}
		else if(phvalue>10 && phvalue<=11)
		{
			System.out.println("Milk of Magnesium");
		}
		else if(phvalue>11 && phvalue<=12 )
		{
			System.out.println("Ammonia");
		}
		else if(phvalue>12 && phvalue<=12.9 )
		{
			System.out.println("Soapy Water");
		}
		else if(phvalue>=13 && phvalue<=13.9 )
		{
			System.out.println("Bleach");
		}
		else if(phvalue==14)
		{
			System.out.println("Drain Cleaner");
		}
		else 
		{
			System.out.println("Invalide ph value");
		}
	}
}
