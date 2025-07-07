package Static;

public class StaticKeyword {
	static int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(a);
//		StaticKeyword s1 = new StaticKeyword();
//		System.out.println(s1.b);
//		System.out.println(StaticKeyword.b);
//		int a = 99;
//		System.out.println(this.a);
		StaticKeyword s1 = new StaticKeyword();
		s1.display();
	}
	public void display()
	{
		int a = 99;
		System.out.println(a);
		System.out.println(this.a);
	}

}
