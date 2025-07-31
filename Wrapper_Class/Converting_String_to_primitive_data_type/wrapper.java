package Converting_String_to_primitive_data_type;



public class wrapper {

	public static void main(String[] args) {
		
		
		String s = "12";
		Integer i  = Integer.parseInt(s);
		System.out.println(i);
		
		
		
		String s1 = "true" ;
		Boolean s2 = Boolean.parseBoolean(s1);
		System.out.println(s2);
		
		
		String s3 = "20.0" ;
		Double s4 = Double.parseDouble(s3);
		System.out.println(s4);
		
		
		

		String s5 = "30.00" ;
		Float s6 = Float.valueOf(s5);
		System.out.println(s6);
		
		
		
		String s7 = "S" ;
		Character s8 = s7.charAt(0);
		System.out.println(s8);
		
		
		
		
		
		
	}
}
