//WAP for a class to have both static and non static method"

package assignment;

public class assignment_08 {
	
	static int a = 10;
	static int b = 12;
	static int c ;
	public static void Add()
	{
		c = a + b;
		System.out.println(c);
	}
	public void sub()
	{ 
		 c = b-a;
		 System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment_08 obj = new assignment_08();
		Add();
		obj.sub();
		
	}

}
