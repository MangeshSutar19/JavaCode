/*"Assignment 50
WAP which has Local, Global and Final variables in it.
Print all variables value"*/

package assignment;

public class assignment_50 {

	 int a = 85 ; // global non static variable
	 static double  b = 85.5 ;// global static variable
	 
	 final static double piValue = Math.PI;	   // final static variable 
	 final char ch = 'a'; // final non static variable 
	 
	public static void main(String[] args) {
	
		int a1 = 0; //local variable
		final double k =  986.3;   //final local variable
		
		assignment_50 obj= new assignment_50();
		
		
		System.out.println("Global variables");
		
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(piValue);
		System.out.println(obj.ch);
		
		System.out.println();

		System.out.println("local variables");
		System.out.println(a1);
		System.out.println(k);
		
	}

}
