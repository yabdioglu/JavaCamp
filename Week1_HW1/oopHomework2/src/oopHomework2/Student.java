package oopHomework2;

public class Student extends User {
	private int studentId;
	private String homework;
	
	

	public Student(int studentId,String firstName, String lastName, String password,  String homework) {
		super(firstName, lastName, password);
		this.studentId = studentId;
		this.homework = homework;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}
	

}
