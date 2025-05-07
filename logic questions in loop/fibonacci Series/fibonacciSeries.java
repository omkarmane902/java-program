import java.util.Scanner;
class fibonacciSeries 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms:");
        int num = sc.nextInt();

        int n1 = 0, n2 = 1, n3;
        int count = 0;

        while (count < num)
			{
            System.out.println(n1); 
            n3 = n1 + n2;           
            n1 = n2;                
            n2 = n3;
            count++;
        }
    }
}
