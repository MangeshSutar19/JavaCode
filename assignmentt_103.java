/*"Assignment 103
Logical Opeartors
AND
OR
And with not
OR with not"*/


package assignment;

import java.util.Scanner;

public class assignmentt_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value 1");
        int num1  = sc.nextInt();
        		
        System.out.print("Enter value 2 ");
        int num2  = sc.nextInt();
        
        
        // AND (&&) operator
        System.out.println("Logical AND (&&) Operation:");
        if (num1 < num2) {
            System.out.println("num1 is less than num2 .");
        } else {
            System.out.println("num2 is greater than num2");
        }

        // OR (||) operator
        System.out.println("Logical OR (||) Operation:");
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is lessa than num1");
        }

        
        System.out.print("Enter first boolean value (true/false): ");
        boolean bool1 = sc.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");        
        boolean bool2 = sc.nextBoolean();
        
        // AND with NOT (!)
        System.out.println("\nLogical AND with NOT (!):");
        if (!(bool1 && bool2)) {
            System.out.println("At least one of them is false.");
        } else {
            System.out.println("Both are true.");
        }

        // OR with NOT (!)
        System.out.println("\nLogical OR with NOT (!):");
        if (!(bool1 || bool2)) {
            System.out.println("Both are false.");
        } else {
            System.out.println("At least one of them is true.");
        }
	}

}
