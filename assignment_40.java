/*"Assignment 40
Write program on 
UpCasting"*/

package assignment;

class superclass

{
	
public static void method1()
{

	System.out.println("Super class method 1");
}

}

public class assignment_40 extends superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superclass obj = new assignment_40();
        obj.method1();		

	}

}
