
//static keyword वापरला की तो variable/method/block class ला belong करतो, म्हणजेच object तयार न करतासुद्धा वापरता येतो.

// तो सर्व objects साठी common असतो (shared memory).

//Static variable → सर्व objects साठी एकच value असते.

// Non-static variable (instance variable) → प्रत्येक object साठी वेगळी value असते.




package Static_Variable;

public class Static1 {
	
	
	static String username ="Omkar mane ";
	
	static int age = 22 ;
	
	
	
	
	public static void main(String[] args) {
		
		
		String username2 = Static1.username;
		
		int age = Static1.age;
		
		
		
		System.out.println("User name : " + username2);
		
		System.out.println("Age : " + age);
		
		
		
	}

}
