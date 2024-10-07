package assignment;

class tempclass5
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

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


}
public class tempclass4 extends tempclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		tempclass4 obj = new tempclass4();
		obj.setStudentid(123);
		obj.setStudentname("Mangesh");
	
		
		System.out.println(obj.getStudentid());
		System.out.println(obj.getStudentname());

	}

}
