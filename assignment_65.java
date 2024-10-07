/*"Assignment 65
WAP for Abstract class which has concrete and abstract methods in it and access those methods"*/

package assignment;
abstract class AbstractClass
{
	
abstract void abstractMethod(); // no implementation

public static void ConcreteMethod()
{
	
System.out.println("Implementation present");

}

}
public class assignment_65 extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment_65 obj = new assignment_65();
		obj.abstractMethod();
		obj.ConcreteMethod();

	}

	void abstractMethod() {

		System.out.println("Overriden method");
	}

}
