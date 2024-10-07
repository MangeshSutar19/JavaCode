//WAP for Multi-level Inheritance in a single class program and also in separate classes 
package assignment;
class ClassOne
{
     void sub()
     {
    	 System.out.println("Class one-supermost parent class");
     }
}
class ClassTwo extends ClassOne
{

    void add()
    {
   	 System.out.println("Class two--parent class");
    }

}
public class assignment_21  extends ClassTwo{

	public static void main(String[] args) {
      
		System.out.println("Sub class");
		
		assignment_21 obj = new assignment_21();
		obj.add();
        obj.sub();
		
	}

}
