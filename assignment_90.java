/*"Assignment 90
WAP - for  StringBuffer and its methods
append, insert, replace, delete, reverse, capacity, CharAt, length, substring etc"*/

package assignment;

public class assignment_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Mangesh");
		
		 // Display initial content and properties
        System.out.println("Initial StringBuffer: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(5, 6, " ");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Display a specific character
        char charAtIndex = sb.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);

        // Get the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length: " + length);

        // Get a substring
        String substring = sb.substring(0, 5);
        System.out.println("Substring (0-5): " + substring);
        
        // Final state of StringBuffer
        System.out.println("Final StringBuffer: " + sb);
		

	}

}
