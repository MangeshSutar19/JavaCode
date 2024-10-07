/*"Assignment 89
WAP - for  StringBuilder and its methods
append, insert, replace, delete, reverse, capacity, CharAt, length, substring etc"*/

package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class assignment_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	s1.inser
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Display initial content and properties
        System.out.println("Initial StringBuilder: " + sb);
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

        // Get the length of the StringBuilder
        int length = sb.length();
        System.out.println("Length: " + length);

        // Get a substring
        String substring = sb.substring(0, 5);
        System.out.println("Substring (0-5): " + substring);
        
        // Final state of StringBuilder
        System.out.println("Final StringBuilder: " + sb);

		

	}

}
