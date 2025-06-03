//1² + 9² = 1 + 81 = 82

//8² + 2² = 64 + 4 = 68

//6² + 8² = 36 + 64 = 100

//1² + 0² + 0² = 1 + 0 + 0 = 1  Happy Number

public class HappyNumber 
{
	public static void main(String[] args) 
	{
        System.out.println(isHappyNumber(19)); // true
        System.out.println(isHappyNumber(2));  // false
    }
    public static boolean isHappyNumber(int num) 
	{
        while (num != 1 && num != 4)
			{
            int sum = 0;
            while (num > 0) 
			{
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    
}
