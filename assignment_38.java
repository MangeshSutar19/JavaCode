/*"Assignment 38
Find FUture Time"*/

package assignment;

import java.util.Date;

public class assignment_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1  = new Date();
		Date d2 = new Date(d1.getTime()+(1000*60*60*24)*9);
		System.out.println(d2);
		
		 
	}

}
