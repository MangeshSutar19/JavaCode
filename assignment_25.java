package assignment;

import java.util.Arrays;


public class assignment_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1[]  = new char[3];
		char ch2[]  = new char[3];
		
		ch1[0] ='a';
		ch1[1] = 'b';
		ch1[2] = 'c';
		
		System.out.println(Arrays.toString(ch1));


		ch2[0] ='a';
		ch2[1] = 'b';
		ch2[2] = 'c';
		System.out.println(Arrays.toString(ch2));
		

		boolean b = Arrays.equals(ch1, ch2);
		if(b==true)
		{
		System.out.println("Both arrays are equal");
		
		}
		
		else
		{
			System.out.println("Both arrays are not equal");
			
		}
		
		
		
	}

}
