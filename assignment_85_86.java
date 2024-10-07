package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class assignment_85_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue s0 = new LinkedList();
		
		
		s0.add("Mangesh");
		s0.add("SUTAR");
		s0.add('c');
		s0.add(59);
		s0.add(96.3);
		s0.add(85.4f);
		s0.add(null);
		 
		 Iterator itr = s0.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 


			Queue s1 = new LinkedList();

		s1.add(66); // it does not follow indexing 
		s1.add(44);
		s1.add(66);
		s1.add(44); //it does not accept duplicate 
		s1.add(16);
		s1.add(24);
		s1.add(46);
		s1.add(54);
		s1.add(76);
		s1.add(74);
    
	 Iterator itr3 = s1.iterator();
		 
		 while(itr3.hasNext())
		 {
			 System.out.println(itr3.next());
		 }
		 
		 
		 //sorting

			Queue s2 = new LinkedList();
			s2.add(198);
			s2.add(197);
			s2.add(195);
			s2.add(116);
			s2.add(120);
			s2.add(203);
			s2.add(503);
			 
		 System.out.println("Before sorting " +s2);
		 
			
			List<Integer> li = new ArrayList(s2);
		
		 Collections.sort(li);
		 System.out.println("After sorting " +li);
		 	}

		
		

	}

