/*"Assignment 41
Write Program 
using Try and Catch
block"*/

package assignment;

import java.util.Scanner;

public class assignment_41 {

	public static void main(String[] args) {
	
		
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter values ");
			int a  =sc.nextInt();
			int b = sc.nextInt();
			int result = a/b ;
			System.out.println("Divsion is "+ result);
			
			 
		  
		}
		catch(Exception e)
		{
          System.out.println("Cant divide by 0");			
		}
	}

}
