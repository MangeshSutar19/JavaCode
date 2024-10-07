/*"Assignment 55
WAP to add two numbers. take inputs using scanner class"*/

package assignment;

import java.util.Scanner;

public class assignment_55 {

	static int result ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		result = num1+num2;
		System.out.println("Addition of two number is " +result);

	}

}
