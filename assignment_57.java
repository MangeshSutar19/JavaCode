/*"Assignment 57
WAP for Single level inheritance - both class in same program"*/

package assignment;

class superclass2
{
	public static void test()
	{
		System.out.println("Test method of parent class");
	}

}
public class assignment_57 extends superclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assignment_57 obj = new assignment_57();
		obj.test();  // test method of parent class
	}

}
