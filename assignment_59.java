/*"Assignment 59
WAP for hierarchy level inheritance"*/

package assignment;

class parent1   //parent class
{

	
public static void paren1Method()
{
	System.out.println("Parent 1 method");	
}
}
class parent2 extends parent1   // child 1 
{
	public static void paren2Method()
	{
		System.out.println("Parent 2 method");	
	}	

}
public class assignment_59  extends parent1{  //child 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assignment_59 obj = new assignment_59();  // object of child 2
		parent2 obj2  = new parent2();   // object of child 1
		
	obj.paren1Method();
	
	obj2.paren1Method();
	obj2.paren2Method();
		
		
		
	}

}
