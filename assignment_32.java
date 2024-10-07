/*Assignment 32
Write a program to 
reverse String
ex-school*/

package assignment;

public class assignment_32 {
	  static  String output = "" ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "ex-school";
		
		System.out.println("Length of string is  " +input.length());
		 for( int i = input.length()-1;i>=0;i--)
		 {
			output = output + input.charAt(i);
		 }
		 System.out.println(output);
		 
	}

}
