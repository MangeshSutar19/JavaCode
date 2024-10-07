/*"Assignment 88
WAP - for Map. 
Iterate through map elements using Iterator"*/

package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class assignment_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("Syoug", 125 ) ;  // two paramter -- object key and object  value
		m1.put("Mangesh", 97);
		m1.put("sayali", 98);
		m1.put("supriya", 94);
		
		System.out.println(m1);
		

		Set<Entry<String, Integer>> p1 =  m1.entrySet();
		Iterator itr = p1.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}


		
		
	}

}
