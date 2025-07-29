package boxing;

public class wrap3 {
	
	public static void main(String[] args) {
		 Integer i  = new Integer(100);
		 
		 Double d = new Double(200.0);
		 
		 // System.out.println(i==d);  CTE
		 
		 
		 System.out.println(i.equals(d)); //waring 
		 
		 System.out.println(d.hashCode());
		 
		 
		 Boolean b = new Boolean(true);
		 
		 System.out.println(b.hashCode());
		 
		 Byte b1 = new Byte((byte) 1);
		 
		 System.out.println(b1.hashCode());
		 
		 Long l  =  new Long(14442566);
		 
		 System.out.println(l.hashCode());
		 
		 Float f = new Float(20.22);
		 System.out.println(f.hashCode());
		 
		 Character c = new Character('s'); 
		 System.out.println(c.hashCode());
		 
		 
				 
	}

}
