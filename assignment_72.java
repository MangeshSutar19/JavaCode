//"Assignment 72 WAP - In  given string remove all the capital letters"*/
package assignment;

public class assignment_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s11 = "Gokhale rahalkar 1259 , test 9898798";

        //in the given string remove all the upper case letter
        String s14  =  s11.replaceAll("[A-Z]", "");
        System.out.println(s14);

        
	}

}
