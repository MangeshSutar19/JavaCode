package assignment;

public class assignment_48 {

	public static void add()
	{
		System.out.println("non paramterized");
	}
	public static void add(int a , int b)
	{

		System.out.println("paramterized add method of int type");
	}

	public static void add(double a , int b)
	{

		System.out.println("paramterized add method of double and int type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		add(9 , 8 );
		add(85.25,9);
		
	}

}
