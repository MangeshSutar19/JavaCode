/*"Assignment 63
WAP for Super keyword"*/


package assignment;

class parent_assignment_63   //parent class
{

	
public  void paren1Method()
{
	System.out.println("Parent 1 method");	
}
}



public class assignment_63  extends parent_assignment_63{
	
	public  void paren1Method()
	{
		super.paren1Method();
		System.out.println("child 1 method");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assignment_63 obj = new assignment_63();
		obj.paren1Method();

	}

}
