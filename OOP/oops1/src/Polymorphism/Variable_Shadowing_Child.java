package Polymorphism;

public class Variable_Shadowing_Child extends Variable_Shadowing_Parent {

	
	int num = 20;
	
	
	 void show() {
		 
		   System.out.println(num);
	        System.out.println(super.num);
	    }
}
