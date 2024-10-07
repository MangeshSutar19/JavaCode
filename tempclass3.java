package assignment;

public class tempclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		78 , 98 , 65, 85, 113
		
		int a[]= {78 , 98 , 65, 85, 113};
	
		int number = a[0];
		for(int i =0; i < a.length ; i++)
		{
		
		  if(number <a[i])

		{
			  number =a[i];
		}
		  
		}
		 System.out.println(number);  
		}

	

}
