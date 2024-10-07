/*Assignment 34
Find out if 
given two string are 
anagram of each other*/

package assignment;

import java.util.Arrays;

public class assignment_34 {

	public static void main(String[] args) {
		
		String str1 = "ram";
		String str2 = "arm";
		
		System.out.println("Length of 1st string " +str1.length());

		System.out.println("Length of 2nd string " +str2.length());
		
         char ch[] = str1.toCharArray();
         char ch2[] = str2.toCharArray();
         
         System.out.println(Arrays.toString(ch));
         System.out.println(Arrays.toString(ch2));
         
         System.out.println("Sorted arrays");
         
         Arrays.sort(ch);
         Arrays.sort(ch2);
         
         System.out.println(Arrays.toString(ch));
         System.out.println(Arrays.toString(ch2));
         
        boolean b =          Arrays.equals(ch, ch2);
	
        if(b==true)
        {
        	System.out.println("Given two strings are anagram");
        }
        else
        {

        	System.out.println("Given two strings are not anagram");
        }
	}

}
