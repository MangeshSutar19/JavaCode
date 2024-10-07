//find out area of 10 circles where every circle radius comes from the Math.random()

package assignment;

public class assignment_23 {

	final static double Pi =  Math.PI;
	static double r ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1 ; i <=10 ; i++)
		{
		    r = Math.random();
		    
		   System.out.println(" Area of circle " +i+ "=" +(Pi*r*r) );
		}
	}

}
