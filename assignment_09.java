//WAPin which there are 3 static methods,3 nonstatic methods & 3 constructors.. 3 static methods can be parameterized? 

package assignment;

public class assignment_09 {
	public assignment_09(char c , int a)
	{
	    System.out.println("parameterized constructor  -  char and int");	
	}

	public assignment_09(int a )
	{
	    System.out.println("parameterized constructor  -   int");		
	}
	public assignment_09(String S)
	{
	    System.out.println("parameterized constructor  -   String");		
		
	}
	public static void method1(int a , int b)
	{
	    System.out.println("Static method parameterized   -   int , int");		

	}
	public static void method2(double d  , char c)
	{
	    System.out.println("Static method parameterized   -   double , char");		
	}
	public static void method3(char c , double d)
	{
	    System.out.println("Static method parameterized   -   char  , double");
	}
	public void method4(int a)
	{
	    System.out.println("non Static method parameterized   -  int");
	}
	public void method5(char c)
	{
	    System.out.println("non Static method parameterized   -  char");

	}
	public void method6(double d)
	{
	    System.out.println("non Static method parameterized   -  double");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assignment_09 a = new assignment_09('c' , 9);
		assignment_09 a1 = new assignment_09('c' , 9);
		assignment_09 a2 = new assignment_09("Mangesh s");
	  
		
		method1(9 ,12);
		method2(96.3 , 'c');
		method3('a', 66.3);
		
		a.method4(5);
		a1.method5('c');
		a2.method6(96.3);
		
		

	}

}
	