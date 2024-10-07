//Use nextByte() give 32000 as Input, What exception is coming in OutPut

package assignment;
import java.util.Scanner;
public class assignment_20 {

	static int employeeid;
	static String employeename;
	static char gender;
	static long mobilenumber ;
	static String employeeAddress;
	static double salary;
    static	float f ;
	static byte b ;
	static short s ;
	static boolean k ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		byte b = sc.nextByte();
		
		
		
		/*32000
Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"32000" Radix:10
	at java.base/java.util.Scanner.nextByte(Scanner.java:2017)
	at java.base/java.util.Scanner.nextByte(Scanner.java:1965)
	at assignment.assignment_20.main(assignment_20.java:24)
*/
		
		
	/*	System.out.println("Enter employee id ");
		employeeid = sc.nextInt();
		System.out.println(employeeid);
		
		System.out.println("Enter employee name ");
		employeename = sc.next();
		System.out.println(employeename);
		
		System.out.println("Enter employee Address ");
		employeeAddress = sc.next();
		sc.nextLine();
		System.out.println(employeeAddress);
		
		System.out.println("Enter employee salary ");
		salary = sc.nextDouble();
		System.out.println(salary);

		
		System.out.println("Enter employee exist in the company ");
		k = sc.nextBoolean();
		System.out.println(k);
		*/
			
	}

}
