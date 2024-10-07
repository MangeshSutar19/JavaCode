package assignment;

import java.util.Arrays;

public class assignment_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,4,6,8,10};
	    int b [] = new int[5];
	    
	    for(int i = a.length-1, k=0 ;i>=0;i--)
	    {

	   System.out.println(a[i]);
	   b[k] =a[i];
	   k++;

	    }

		System.out.println(Arrays.toString(b));
	}

}
