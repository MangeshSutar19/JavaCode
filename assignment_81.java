/*"Assignment 81
WAP - for iteration of Stack and Vector using Enumeration"*/

package assignment;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class assignment_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//stack


		 System.out.println("stack -legacy class");

		Stack ltr = new Stack();
		 ltr.add("Mangesh");
		 ltr.add("SUTAR");
		 ltr.add('c');
		 ltr.add(59);
		 ltr.add(96.3);
		 ltr.add(85.4f);
		 ltr.add(null);
		 
		 Enumeration e = ltr.elements();
		 
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }
		 
		 
		 System.out.println("vector -legacy class");

			//vector		 
	
		 Vector ltr1 = new Vector();
		 ltr1.add("Mangesh");
		 ltr1.add("SUTAR");
		 ltr1.add('c');
		 ltr1.add(59);
		 ltr1.add(96.3);
		 ltr1.add(85.4f);
		 ltr1.add(null);
		 
		 Enumeration e1 = ltr1.elements();
		 
		 while(e1.hasMoreElements())
		 {
			 System.out.println(e1.nextElement());
		 }
		 
	}

}
