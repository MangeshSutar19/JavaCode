package assignment;

public class assignment_49  {

	
	public assignment_49()
	{
		System.out.println("Non parameterized constructor");
	}
	
	public assignment_49(int a )
	{
		System.out.println("int type parameterized constructor");
		
	}	
	public assignment_49(double a )
	{
		System.out.println("double type parameterized constructor");
		
	}	
	
	public static void main(String[] args) {
		assignment_49 obj = new assignment_49();
		assignment_49 obj1 = new assignment_49(6);
		assignment_49 obj2 = new assignment_49(96.3);
		
		
	}

}
