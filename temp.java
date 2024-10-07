package assignment;

import java.util.Arrays;

public class temp {
	
	static int countOfDigit = 0;
	
	static boolean b1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		int a[] =  new int[4];
		int b[] = new int [4];
		
		a[0] = 15;
		a[1]= 16;
		a[2]= 17;
		a[3] = 18;
		for(int i = 0; i < a.length;i++)
		{
			
			System.out.println(a[i]);
			
			
			 
		}
		System.out.println(Arrays.toString(a));
		System.out.println("*********");
		for(int j = a.length -1; j >=0 ; j--)
		{
			b[j] = a[j];
			System.out.println(b[j]);
		}
		
		Character.isDigit(a[0]);
		
		//System.out.println(Arrays.toString(b));

				  

	}

}
