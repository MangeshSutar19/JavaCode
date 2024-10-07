/*"Assignment 104
If Else If program with 4 else if block"*/

package assignment;

import java.util.Scanner;

public class assignmentt_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("The number is greater than 100.");
        } else if (number > 75) {
            System.out.println("The number is between 76 and 100.");
        } else if (number > 50) {
            System.out.println("The number is between 51 and 75.");
        } else if (number > 25) {
            System.out.println("The number is between 26 and 50.");
        } else if (number > 0) {
            System.out.println("The number is between 1 and 25.");
        } else {
            System.out.println("The number is zero or negative.");
        }


	}

}
