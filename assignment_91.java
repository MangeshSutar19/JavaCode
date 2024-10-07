/*"Assignment 91
WAP for Assert keyword"*/

package assignment;

public class assignment_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 int number = 10;

	        // Example of a simple assertion
	        assert number > 0 : "Number must be greater than 0";

	        System.out.println("Number is: " + number);

	        // Another example of an assertion
	        number = -5;

	        // This assertion will fail and throw an AssertionError
	        assert number > 0 : "Number must be positive";

	        System.out.println("This line will not be printed if the assertion fails.");


	}

}
