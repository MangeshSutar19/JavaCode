//WAP for calculating area of a circle,rectangle,square,triangle,trapezium.also calculating circumference of circle,rectangle and square using Scanner Class (user inputs)

package assignment;

import java.util.Scanner;

public class assignment_11To18 {

	public static double Pivalue = Math.PI;
	
	public static void AreaOfCircle(int radius)
	{
		double area ;
		area =Pivalue*radius*radius;
		
		System.out.println("Area of Circle is " +area);
	}
	public static void AreaOfrectangle(double length, double width)
	{
		double area ;
		area = length * width;
		
		System.out.println("Area of Rectangle is " +area);
	}
	public static void AreaOfSquare(double side)
	{
		double area ;	
		area = side*side;
		System.out.println("Area of square is " +area);
		
	}
	public static void AreaOftriangle(double base , double height)
	{
		double area ;
		area = 0.5 * base * height;
		System.out.println("Area of triangle is " +area);
	}
	
	public static void AreaOftrapezium(double base1 , double base2 , double height)
	{		double area ;
		
	      area = 0.5 * (base1 + base2) * height;
	      System.out.println("Area of trapezium is" +area);
	}
	public static void CircumferenceOfCircle(double radius)
	{
		double CircumferenceOfCircle ;
		CircumferenceOfCircle = 2*radius*Pivalue;
		System.out.println("Circumference Of Circle is "  +CircumferenceOfCircle);
	}
	public static void CircumferenceOfRectangle(double length, double width)
	{
		double Perimeter;
		Perimeter=2*(length+width);
		System.out.println("Circumference Of Rectangle is " +Perimeter);
	}
	public static void CircumferenceOfSquare(double side)
	{
		double perimeter;
		perimeter = 4 * side;
		System.out.println("Circumference Of square is " +perimeter );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to calculate area of circle");
		System.out.println("Enter 2 to calculate area of rectangle");
		System.out.println("Enter 3 to calculate area of square");
		System.out.println("Enter 4 to calculate area of triangle");
		System.out.println("Enter 5 to calculate area of trapezium");
		
		System.out.println("Enter 6 to calculate Circumference Of Circle");
		System.out.println("Enter 7 to calculate Circumference Of rectangle");
		System.out.println("Enter 8 to calculate Circumference Of squre");
		
		int num =  sc.nextInt();
		switch(num)
		{
		case 1 : 
		System.out.println("Enter radius");
		AreaOfCircle(sc.nextInt());
		break;
		
		case 2:
		System.out.println("Enter lenght and width");
		AreaOfrectangle(sc.nextDouble() , sc.nextDouble());
		break;
		
		case 3: 
		
		System.out.println("Enter side");
		AreaOfSquare(sc.nextDouble());
		break ;
		
		case 4 : 
		System.out.println("Enter base and height");
		AreaOftriangle(sc.nextDouble(), sc.nextDouble());
		break;
		
		case 5 : 
		System.out.println("Enter base1 , base2 and height");
		AreaOftrapezium(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		break;
		
		case 6 : 
			System.out.println("Enter radius");
			CircumferenceOfCircle(sc.nextDouble());
			break;

		case 7 : 
			System.out.println("Enter lenght and height");
			CircumferenceOfRectangle(sc.nextDouble(), sc.nextDouble());
			break;
			

		case 8 : 
			System.out.println("Enter side");
			CircumferenceOfSquare(sc.nextDouble());
			break;
			
		default :
			System.out.println("please enter valid number");
			
	}

}
}
