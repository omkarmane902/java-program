public class Power {
    public static void main(String[] args) {
        
      System.out.println( PowerCal(5, 4));
    }

    static int PowerCal (int base , int exponent)
    {
        if(exponent == 0) return  1;

        return  base * PowerCal(base, exponent -1);

    }
}
