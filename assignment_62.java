/*"Assignment 62
WAP for method overriding"*/

package assignment;
class parent_assignment_62   //parent class
{

	
public static void paren1Method()
{
	System.out.println("Parent 1 method");	
}
}


public class assignment_62 extends parent_assignment_62 {
	
	public static void paren1Method()
	{
		System.out.println("child 1 method");	
	}

	public static void main(String[] args) {
		
		assignment_62 obj =new assignment_62();
		obj.paren1Method();
	}

}
