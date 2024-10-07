/*"Assignment 79
WAP - for  iteration of ArrayList using iterator"*/


package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class assignment_79 {

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
		 
		 Iterator itr = ltr.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		
		
	}

}
