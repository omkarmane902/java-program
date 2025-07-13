package Abstract;

public class Calculator_impCalculatorDriver {
public static void main(String[] args) {
	
	Calculator c1 = new Calculator_imp();
	
	c1.add(5, 4);
	c1.sub(10, 2);
	c1.multi(3, 6);
	c1.divi(4, 4);
    }
}
