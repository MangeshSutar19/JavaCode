/*
"Assignment 96
WAP - which has SIB, IIB, Construtor and call each of them"*/


package assignment;

public class assignment_96 {

	  // Static Initialization Block (SIB)
    static {
        System.out.println("Static Initialization Block (SIB) called.");
    }

    // Instance Initialization Block (IIB)
    {
        System.out.println("Instance Initialization Block (IIB) called.");
    }

    // Constructor
    public assignment_96() {
        System.out.println("Constructor called.");
    }
 public static void main(String[] args) {
	        System.out.println("Main method starts.");

	        // Creating the first object of InitializationDemo class
	        System.out.println("Creating first object:");
	        assignment_96 obj1 = new assignment_96();

	        // Creating the second object of InitializationDemo class
	        System.out.println("\nCreating second object:");
	        assignment_96 obj2 = new assignment_96();

	        System.out.println("Main method ends.");

	}

}




/*Static Initialization Block (SIB): This block is executed when the class is first loaded into memory, and it is executed only once. It is primarily used to initialize static variables or perform one-time setup.

Instance Initialization Block (IIB): This block is executed every time an object of the class is created, before the constructor is called.

Constructor: The constructor is executed after the IIB. It initializes the instance variables or performs tasks specific to the creation of an object.*/