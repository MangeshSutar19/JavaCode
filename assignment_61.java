/*"Assignment 61
WAP for this calling statement"*/

package assignment;

public class assignment_61 {

	public assignment_61()
	{
		this(9);
		System.out.println("No parameterized const");
	}
	
	public assignment_61(int i )
	{
		this('c');
		System.out.println("int type parameterized const");
	}
	

	public assignment_61(char i )
	{
		this("Mangesh");
		System.out.println("char  type parameterized const");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment_61 obj = new assignment_61();
	}
	public assignment_61(String  i )
	{
		System.out.println("String  type parameterized const");
	}

}
