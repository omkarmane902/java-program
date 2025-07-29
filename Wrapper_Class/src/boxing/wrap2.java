package boxing;

public class wrap2 {

	
	public static void main(String[] args) {
		
		
		
		Integer i = new Integer(100);
		
		Integer d = new Integer(100);
		
		System.out.println(i==d);
		
		
		System.out.println(i.equals(d));
		
		System.out.println(i.hashCode());
		System.out.println(d.hashCode());
	}
}
