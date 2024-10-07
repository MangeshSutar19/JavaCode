package assignment;

import java.util.Arrays;

public class assignment_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String ch1[]  = new String[3];
		String ch2[]  = new String[3];
		
		ch1[0] = "Mangesh";
		ch1[1] = "Eknath";
		ch1[2] = "Sutar";
		
		System.out.println(Arrays.toString(ch1));


		ch2[0] = "Mangesh";
		ch2[1] = "Eknath";
		ch2[2] = "Sutar";
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
