package class_object_equal_example;

public class Student {
	 String name;
	    int id;

	    // Constructor
	    Student(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    // Overriding equals() method
	    @Override
	    public boolean equals(Object obj) {
	        // Check if same object reference
	        if (this == obj)
	            return true;

	        // Check if obj is an instance of Student
	        if (obj instanceof Student) {
	            Student other = (Student) obj;
	            // Compare by id and name
	            return this.id == other.id && this.name.equals(other.name);
	        }

	        return false;
	    }
}
