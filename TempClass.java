package assignment;

import java.util.Arrays;

public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//revers array and store it in diff. array
	     int a[]  =  new int[4];
	     int b[] = new int [4];
	     
	     a[0] = 1;
	     a[1] = 2;
	     a[2] = 3;
	     a[3] = 4;
	     
	     
	     System.out.println(Arrays.toString(a));
	     
	     for(int i = 3,k=0 ; i>=0 ;i--)
	     {
	    	 b[k] = a[i];
	    	 k++;
	     }
	     System.out.println(Arrays.toString(b));
	
	}

}
