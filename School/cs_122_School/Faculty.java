package cs_122_School;

public class Faculty extends Student implements FacultyInterface {
	
	private String facultyId;
	
	public Faculty(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	
	public String getFacultyId() {
		return facultyId;
	}
	
	public void printObject() {
		System.out.println("Faculty ID:\t" + facultyId);
	}
}
