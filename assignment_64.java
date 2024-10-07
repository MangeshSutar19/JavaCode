package assignment;

public class assignment_64 { 
	
	 static int student_id ;
	 static String StudentName;
	 
	 public  void method(int studentid, String studname)
	 {
		 
		 System.out.println("Method called ");
		 this.student_id = studentid;
		 this.StudentName = studname;
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment_64 obj = new assignment_64();
		
	obj.method(11, "Mangesh");  //assigned local variable's value to global variables
		System.out.println(student_id);
		System.out.println(StudentName);


	
	}

}
