class add1
{
public static void main (String[]args)
{
    byte a =20 ;
	byte b =30 ;
	int c = a + b;
	System.out.println(c);
	
	short d = 200;
	short e = 500;
	int f = d + e;
	System.out.println(f);
	

	char g = 'a';
	char h = 'b';
	int i = g + h;
	System.out.println(i);
	
    int j =1000;
	int k =2000;
	int l = j + k;
	System.out.println(l);
	
	long  m = 100000l;
	long n = 487348974l;
	long o = m + n;
	System.out.println(o);
	
    float p = 87.84f;
	float q = 84.73f;
	float r = p + q;
	System.out.println(r);
	
    double s = 73454.4758;
    double t = 47570549.77438;
    double  w = s+t;
    System.out.println(w);

//bolean give compile time error
	
   String  x = "Qspiders";
   String  y = "jspiders";
   String z = x + y;
   System.out.println(z);
	
}
}