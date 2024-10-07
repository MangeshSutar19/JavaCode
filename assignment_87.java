/*
"Assignment 87
WAP - for Map. 
Iterate through map elements using for each loop"*/
package assignment;

import java.util.HashMap;
import java.util.Map;

public class assignment_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("Syoug", 125 ) ;  // two paramter -- object key and object  value
		m1.put("Mangesh", 97);
		m1.put("sayali", 98);
		m1.put("supriya", 94);
		
		System.out.println(m1);
		
		for(String s : m1.keySet())

		{
			System.out.println(s);
		}

		for(int  value : m1.values())

		{
			System.out.println(value);
		}


	}

}
