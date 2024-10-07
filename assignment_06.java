
//WAP on updating the value of variable
package assignment;

public class assignment_06 {

	static byte b =  11 ;
	static 	short s = 12 ;
	static 	int i = 1254 ;
	static long l = 8446565399l;
	static float  f  =  12.5f;
	static double d = 12.2;
	static char c = 'c' ;
	static boolean b1 = true;
	static String s1 = "Mangesh ";


	public static void main(String[] args) {
	
		System.out.println("Values before updation");
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(s1);


		System.out.println("***********");
		
		System.out.println("Values after updation");
		b =  12 ;
	    s = 13 ;
		i = 1255 ;
		l = 8446565396l;
		f  =  12.6f;
		d = 12.7;
		c = 'M' ;
		b1 = false;
		s1 = "Mangesh12345 ";

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(s1);
		
	}

}
