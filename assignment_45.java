/*"Assignment 45
hoe to sort the
value of your array "*/

package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_45 {

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

		System.out.println("Sort array");

		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
	}

}
