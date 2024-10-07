//WAP on 
//Banglore Govt Bus rate"

/*
 *below 2 ==> free ticket 
 * above 2 to 18 --> half ticket
 * above 18 to 65  --> full ticket
 * above 65 --> free ticket 
 * female ==> free ticket
 */
package assignment;

public class assignment_07 {

	static int Age=1005;
	static String gender = "Female";

	public static void main(String[] args) {
	
		if(gender =="Male")
		{
			if(Age<=2)
			{
				System.out.println("Free ticket");
			}
			else if(Age >2 && Age <=18 )
			{
				System.out.println("Half ticket");
				
			}
			else if(Age> 18 && Age <=65)
			{
				System.out.println("Full  ticket");
				
			}
			else
			{
				System.out.println("Free ticket");
				
			}
		}
		else
		{
			System.out.println("Ticket is free");
		}
		
	}

}
