/*Assignment 33
Check if given string 
is palindrome or not 
Ex:-Malayalam*/

package assignment;

public class assignment_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String word = "Malayalam";
		String reversword = "";
		
		
		
		for(int i = word.length()-1;i >=0 ;i--)
		{
			
			reversword = reversword+    word.charAt(i);
			
		}
		System.out.println(reversword);
		
		if(word.equals(reversword))
		{
			System.out.println("Given String is palimdrome");
		}
		else
		{
			System.out.println("Given String is not palimdrome");
			
		}



	}

}
