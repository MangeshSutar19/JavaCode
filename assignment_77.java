/*"Assignment 77
WAP - Copy value of one array into second array"*/

package assignment;

import java.util.Arrays;

public class assignment_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {15 , 18 ,1 ,91, 6};
		int b[] = new int[5];
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0 ;i< a.length;i++)
		{
		   b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
