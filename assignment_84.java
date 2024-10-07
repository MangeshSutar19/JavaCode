package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class assignment_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// list iterator
		
		Set ltr = new HashSet();
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

		 Set ltr1 = new HashSet();
			 ltr1.add(198);
			 ltr1.add(197);
			 ltr1.add(195);
			 ltr1.add(116);
			 ltr1.add(120);
			 ltr1.add(203);
			 ltr1.add(503);
			 
		 System.out.println("Before sorting " +ltr1);
		 
			
			List<Integer> li = new ArrayList(ltr1);
		
		 Collections.sort(li);
		 System.out.println("After sorting " +li);
		 	}

}
