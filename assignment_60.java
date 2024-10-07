/*"Assignment 60
WAP for super calling statement"*/


package assignment;

class assignment_60_parent
{
 
	public assignment_60_parent(int a )
	{
		System.out.println("Parent class constructor");
	}

}
public class assignment_60 extends assignment_60_parent {
	
	public assignment_60()
	{
		super(9);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assignment_60 obj= new assignment_60();
		

	}

}
