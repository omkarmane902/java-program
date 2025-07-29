package boxing;

public class wrap1 {

	public static void main(String[] args) {
		
		
		int i = 200;
		
		Integer i2 = new Integer(i);
		
		System.out.println(i2);
		
		
		Integer i1 = new Integer(100);    // boxing
		
		System.out.println(i1);
		
		
		Boolean b1 = new Boolean(true);   //boxing
		
		System.out.println(b1.toString());
		
		System.out.println(b1.getClass().getName() + " " + Integer.toHexString(b1.hashCode()));
		
		
		
	}
}
