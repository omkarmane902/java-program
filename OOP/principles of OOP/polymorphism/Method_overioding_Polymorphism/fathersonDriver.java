package Method_overioding_Polymorphism;

public class fathersonDriver {
public static void main(String[] args) {
	father f1 = new son(); //upcasting
	
	f1.finance();
	f1.name();
}
}
