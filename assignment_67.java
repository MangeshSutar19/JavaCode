package assignment;

public class assignment_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.addExact(9, 9));  //int int
		System.out.println(Math.addExact( 8446565399l, 9890506054l));  //long long
		
		System.out.println(Math.subtractExact(9, 9));  //int int
		System.out.println(Math.subtractExact( 8446565399l, 9890054l));  //long long
		
	    System.out.println(Math.multiplyExact(8, 8));  // int int
	    System.out.println(Math.multiplyExact(8446565399l, 98906054l));  //int and long
	    System.out.println(Math.multiplyExact(8, 9890506054l)); //long long
	    
	    System.out.println(Math.min(9, 8));  //int int 
	    System.out.println(Math.min(8446565399l, 989805054l)); //long long
	    System.out.println(Math.min(95.5f, 95.6f));  //float float
	    System.out.println(Math.min(98.63 , 90.00));  //double double
	    
	   

	    System.out.println(Math.max(9, 8));  //int int 
	    System.out.println(Math.max(8446565399l, 989805064l)); //long long
	    System.out.println(Math.max(95.5f, 95.6f));  //float float
	    System.out.println(Math.max(98.63 , 90.00));  //double double
	    
	    System.out.println(Math.abs(-96.3));  //double
	    System.out.println(Math.abs(-96.3f));  //float
	    System.out.println(Math.abs(-96));  //int 
	    System.out.println(Math.abs(-9890506054l)); //long
	
	}

}
