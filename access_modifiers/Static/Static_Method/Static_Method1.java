//1️⃣ Static Method म्हणजे काय?

//1)static method हे class चे method असते.

//2)हे object-independent असते, म्हणजे object तयार न करता class नावाने call करता येते.

//3)Static method मध्ये static members direct access करता येतात.

//4)Non-static (instance) members direct access करता येत नाहीत, कारण ते object-specific असतात.



// 1)Object-independent: Object न बनवता call करता येतो.

//  2)Memory Location: JVM च्या Method Area / Static Area मध्ये store होतो.

//  3)Cannot access non-static members directly: Object बनवूनच access.

//  4)Can access static members directly: Static variable किंवा static method call करता येतो.

//  5)Use in Utility classes: जसे Math, Collections class मध्ये static methods आहेत.
//    Cannot use this keyword: कारण this instance variable/object चा reference देतो, आणि static method मध्ये object नसेल.



package Static_Method;

public class Static_Method1 {

	static String name = "omkar mane ";
	
	static int age = 22;
	
	
	
	
	static void method()
	{
		System.out.println(Static_Method1.name);
		System.out.println(Static_Method1.age);
		
		System.out.println("this is static method");
	}
	
	public static void main(String[] args) {
	
		
		method();
	}
	
	
	
}
