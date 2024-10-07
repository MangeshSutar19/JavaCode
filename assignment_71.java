/*"Assignment 71
WAP - In  given string remove all the numeric values used"*/

package assignment;

public class assignment_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s11 = "Gokhale rahalkar 1259 , test 9898798";

		  //In the given string remove all the numeric 
        String s13  =  s11.replaceAll("[0-9]", "");
        System.out.println(s13);
      

	}

}
