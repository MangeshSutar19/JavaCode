/*"Assignment 43
Write program Accept
 the value of yout array
 at the runtime ,
if it is of int datatype size os 4
"*/


package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of array");
		int size  =sc.nextInt();

		int a [] = new int[size];
		for(int i = 0 ;i < a.length ; i++)
		
		{

			a[i] = sc.nextInt();
			
//		System.out.println("Enter value of array" +a[i]);
		}
		
		System.out.println(Arrays.toString(a));
	}

}
