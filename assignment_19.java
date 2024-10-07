//Assignment 19 https://grotechminds.com/registration/ FirestName, LastName,Email,Password,Make,Female,Present address,Permanent Address,Pincode

package assignment;

import java.util.Scanner;

public class assignment_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First name");
		sc.next();
		
		System.out.println("Enter Last name");
		sc.next();
		
		System.out.println("Enter email id");
		sc.next();

		System.out.println("Enter password");
        sc.next();
        
        System.out.println("Enter gneder -Male/Female");
        sc.next();
        
//        present add , per add, pincode
        System.out.println("Enter present address");
        sc.next();
        sc.nextLine();
        
        System.out.println("Enter permanent address");
        sc.next();
        sc.nextLine();
        
        System.out.println("Enter pincode");
        sc.nextInt();
        
	}

}
