package Private;



public class A {
 
  private static   int  b = 10;
  
  private  int z = 100;

private A()
{
	
}

private void test()
{
System.out.println("hi omkar");	
}

private static void test1()
{
	System.out.println("h1 omkarrrrrrrrrr");
	}

 public static void main(String[] args) {
	 
	System.out.println(A.b);
	
	A a1 = new A();
	
	a1.test();
	A.test1();
	System.out.println(a1.z);
	
	
	
	
	
	
}
 	
}
