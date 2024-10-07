/*"Assignment 56
WAP for switch case having keywords
switch, case, default and break"*/

package assignment;

import java.util.Scanner;

public class assignment_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to enter Launch chrome browser");

		System.out.println("Enter 2 to enter Launch safari browser");

		System.out.println("Enter 3 to enter Launch mozila browser");
		int num1 = sc.nextInt();
	
		switch(num1)
		{
		case 1 : System.out.println("Launch chrome browser");
		         break;
		case 2 : System.out.println("Launch safari browser");
				 break;
		case 3 : System.out.println("Launch mozila browser");
			     break;
		case 4 : System.out.println("Launch internet explorer browser");
				 break;
		case 5 :System.out.println("Launch egde browser");
				 break;
		default :System.out.println("no  browser details found");
				 
			
		}

	}

}
