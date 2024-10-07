package assignment;


interface inter
{
	
	abstract void abstractMethod(); // no implementation

}
public class assignment_66 implements  inter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assignment_66  obj = new assignment_66();
		obj.abstractMethod();

	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
		System.out.println("OVerrieden method");
		
	}

}
