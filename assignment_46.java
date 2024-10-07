/*"Assignment 46
Iterate List Interface "*/

package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class assignment_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List li = new ArrayList();
		li.add(15);
		li.add(15);
		li.add("Mangesh");
		li.add(null);
		li.add(null);
		li.add(35.6);
		li.add(15.2f);
		li.add(false);
		li.add(8446565399l);
		
		System.out.println(li);
		
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}

}
