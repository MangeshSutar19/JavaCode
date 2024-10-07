/*"Assignment 102
Nested If Else"*/

package assignment;

import java.util.Scanner;

public class assignmentt_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }

        } else if (number < 0) {
            System.out.println("The number is negative.");

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }

        } else {
            System.out.println("The number is zero.");
        }

		
	}

}
