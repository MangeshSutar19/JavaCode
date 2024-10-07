/*"Assignment 80
WAP - for  iteration of ArrayList using ListIterator"*/


package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class assignment_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		List ltr = new ArrayList();
		 ltr.add("Mangesh");
		 ltr.add("SUTAR");
		 ltr.add('c');
		 ltr.add(59);
		 ltr.add(96.3);
		 ltr.add(85.4f);
		 ltr.add(null);
		 
		 ListIterator itr = ltr.listIterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }

		 System.out.println();
		 while(itr.hasPrevious())
		 {
			 System.out.println(itr.previous());
		 }
		
		

		
		
	}

}
