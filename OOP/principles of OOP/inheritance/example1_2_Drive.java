package inheritance;

public class example1_2_Drive 
{
   public static void main(String[] args)
   {
	 example_2 ex2 = new example_2();
	 
	 System.out.println(ex2.ch);
	 System.out.println(ex2.a);
	 
	 ex2.displalyexample_1();
	 ex2.displalyexample_2();
	 
	 
	 example_1 ex1 = new example_1();
	 System.out.println(ex1.a);
	 
	 ex1.displalyexample_1();
   }
}
