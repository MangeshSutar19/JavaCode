package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_44 {

	static int numberTobeChecked = 34 ;
	static boolean flag = false;
	public static void main(String[] args) {

		
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

		for(int i = 0 ;i < a.length ; i++)
			
		{
			if(a[i]==numberTobeChecked)
			{
				
				flag = true;
			}
				
//		System.out.println("Enter value of array" +a[i]);
		}
		if(flag == true)

		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not  present");
				
		}
		
	}

}
