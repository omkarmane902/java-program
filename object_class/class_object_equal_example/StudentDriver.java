package class_object_equal_example;

public class StudentDriver {
	 public static void main(String[] args) {
	        Student s1 = new Student("Omkar", 101);
	        Student s2 = new Student("Omkar", 101);
	        Student s3 = new Student("Ravi", 102);

	        // Comparing using equals()
	        System.out.println(s1.equals(s2)); // true (same data)
	        System.out.println(s1.equals(s3)); // false (different data)
	    }
}
