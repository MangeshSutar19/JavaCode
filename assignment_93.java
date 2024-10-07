/*"Assignment 93
WAP - for Encapsulation"*/

package assignment;

class parent_assignment_93
{
	private int studentid ;
	private String studentname;
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname)  {
		this.studentname = studentname;
	}


}

public class assignment_93 extends parent_assignment_93{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment_93 obj = new assignment_93();
		
		obj.setStudentid(123);
		obj.setStudentname("Mangesh");
	
		
		System.out.println(obj.getStudentid());
		System.out.println(obj.getStudentname());

	}

}
