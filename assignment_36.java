/*
 * 
 * "Assignmnet 36
In given String find
how many are alphabets,
how many are special character,
how many are numeric,
how many are Spaces"
 */

package assignment;

import java.util.Arrays;

public class assignment_36 {

	static int noOfDigit; 
	static int noOfSpace;
	static int noOfChar;
	 static int noofSpecialChar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "fn-502, sairaj tower , plot no c-18, kailas nagar,ambernath-east 421501";
		

        char[] ch = input.toCharArray();
		for(int i =0 ; i< ch.length;i++)
		{
            boolean b =Character.isDigit(ch[i]);
            boolean b1 = Character.isWhitespace(ch[i]);
            boolean b2 = Character.isLetter(ch[i]);
            
         if(b==true)
            {
            	noOfDigit++;
            }
         	else if(b1==true)
         	{
        	 noOfSpace++;
        	 
         	}
         	else if(b2==true)
         	{
        	 noOfChar++;
         	}
         	else
         	{
         		noofSpecialChar++;
         	}
		}
		System.out.println("No of digits are " +noOfDigit);
		
		System.out.println("No of spaces are " +noOfSpace);

		System.out.println("No of characters are " +noOfChar);
		
		System.out.println("No of SpecialChars are " +noofSpecialChar);


		
	}

}
