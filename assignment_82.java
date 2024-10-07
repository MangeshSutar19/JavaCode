/*"Assignment 82
WAP - to find the properties of ArrayList
Indexing
Duplicates
Null
Hetrogenious
Dynamic size
Sorted
Iteration using Iterator and ListIterator"*/

package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class assignment_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// list iterator
		
		ArrayList ltr = new ArrayList();
		 ltr.add("Mangesh");
		 ltr.add("SUTAR");
		 ltr.add('c');
		 ltr.add(59);
		 ltr.add(96.3);
		 ltr.add(85.4f);
		 ltr.add(null);
		 
		 Iterator itr = ltr.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 //sorting

		 ArrayList ltr1 = new ArrayList();
			 ltr1.add(198);
			 ltr1.add(197);
			 ltr1.add(195);
			 ltr1.add(116);
			 ltr1.add(120);
			 ltr1.add(203);
			 ltr1.add(503);
			 
		 System.out.println("Before sorting " +ltr1);
		 Collections.sort(ltr1);
		 System.out.println("After sorting " +ltr1);
		 
		//using list iterator 
		 
		 

		 ArrayList ltr2 = new ArrayList();
			 ltr2.add("Mangesh");
			 ltr2.add("SUTAR");
			 ltr2.add('c');
			 ltr2.add(59);
			 ltr2.add(96.3);
			 ltr2.add(85.4f);
			 ltr2.add(null);
			 
		 ListIterator itr2 = ltr2.listIterator();
		 
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }

		 System.out.println();
		 while(itr2.hasPrevious())
		 {
			 System.out.println(itr2.previous());
		 }
		
		


	}

}
