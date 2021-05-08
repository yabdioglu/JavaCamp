package oopHomework2;

public class Instructor extends User{
	private int instructorId;
	private int courseId;
	private String courseName;
	
	public Instructor(int instructorId, String firstName, String lastName, String password, int courseId, String courseName) {
		super(firstName, lastName, password);
		this.instructorId = instructorId;
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
	

}
