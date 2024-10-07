/*"Assignment 74
WAP - check in given string starts with 'A'"*/

package assignment;

public class assignment_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Aakash";

		
		boolean b = input.matches("A(.*)");
		System.out.println(b);
	}

}
