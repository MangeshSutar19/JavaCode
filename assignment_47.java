/*"Assignment 47
Iterate Set Interface"*/

package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class assignment_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		s.add(15);
		s.add(15);
		s.add("Mangesh");
		s.add(null);
		s.add(null);
		s.add(35.6);
		s.add(15.2f);
		s.add(false);
		s.add(8446565399l);
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		

	}

}
