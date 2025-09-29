
//1️⃣ Static Block म्हणजे काय?

//static block = Static Initialization Block

//हे class load होताच JVM द्वारा automatic execute होते.

//Static block मध्ये static variables initialize करता येतात.

//Object तयार न करता चालते.






package Static_Block;

public class StaticBlock1 {

	
	
	static {
		System.out.println("This is Static block 1");
	}
	
	static {
		System.out.println("This is Static block 2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main block");
	}
}
