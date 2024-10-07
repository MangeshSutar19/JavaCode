/*"Assignment 35
Copy the value of 
one array to anothern
array using iteration"*/

package assignment;

import java.util.Arrays;

public class assignment_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {12, 34, 85 , 96};
		
		int b[] = new int[4];
		
		for(int i = 0; i < a.length;i++)
		{
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));

		System.out.println(Arrays.toString(a));

	}

}
