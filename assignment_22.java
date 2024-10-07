//check if main method can be overloaded by making sure other main methods are non static"

package assignment;

public class assignment_22 {

	public static void main(String[] args) {
		assignment_22 obj = new assignment_22();
		System.out.println("Main method");
        
        main(9);
        obj.main(96.32);
	}
	public static void main(int args) {
        System.out.println("int Main method-overloaded");
	}
	public void main(double args)
	{
        System.out.println("double nonstatic  Main method-overloaded");

	}
	

}
