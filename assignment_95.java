package assignment;

public class assignment_95 {

	
	// Instance variable
    private int instanceVariable;

    // Instance initialization block
    {
        instanceVariable = 20; // Initializing the instance variable
        System.out.println("Instance Initialization Block executed. Instance Variable initialized to: " + instanceVariable);
    }
    
    

    // Constructor
    public assignment_95() {
        System.out.println("Constructor called.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating first object:");
		assignment_95 obj1 = new assignment_95();

        System.out.println("\nCreating second object:");
        assignment_95 obj2 = new assignment_95();
    

	}

}
/*The instance initialization block runs every time an instance of the class is created, before the constructor is executed.
It is useful for initializing instance variables or executing common setup code.
You can have multiple instance initialization blocks in a class, and they will be executed in the order they appear in the code.*/