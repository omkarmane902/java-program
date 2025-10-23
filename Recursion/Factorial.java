public class Factorial {
    

    public static void main(String[] args) {
        
        int n = 5;

        System.out.println(CountOfFactorial(n));
    
        }

        static int CountOfFactorial(int n)
        {
           
          if (n==0) {
            return 1;
          }
          return  n * CountOfFactorial(n-1);
        }
    }