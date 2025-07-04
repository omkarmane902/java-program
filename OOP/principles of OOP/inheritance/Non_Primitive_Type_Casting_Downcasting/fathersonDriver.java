package Non_Primitive_Type_Casting_Downcasting;

public class fathersonDriver {
public static void main(String[] args) {
	
	father f1 = new son();  // upcasting
	
	son s1 = (son)f1; // Downcasting
	
	s1.drinking();
	s1.somking();
}
}
