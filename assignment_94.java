/*"Assignment 94
WAP - of SIB"*/


package assignment;

public class assignment_94 {

	// Static variable
    static int staticVariable;

    // Static initialization block
    static {
        staticVariable = 10; // Initializing the static variable
        System.out.println("Static Initialization Block executed. Static Variable initialized to: " + staticVariable);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        System.out.println("Inside main method.");
	        
	        // Accessing the static variable
	        System.out.println("Static Variable value: " + staticVariable);
	    }

	}



/*The static initialization block runs once when the class is loaded, before any object of the class is created or any static method is called.
You can have multiple static blocks in a class, and they will be executed in the order they are defined.
This feature is useful for complex initialization that requires multiple statements or if you need to handle exceptions during static initialization.*/
