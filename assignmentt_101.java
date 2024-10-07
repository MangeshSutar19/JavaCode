/*"Assignment 101
If Else If program"*/

package assignment;

import java.util.Scanner;

public class assignmentt_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		  if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }


	}

}
