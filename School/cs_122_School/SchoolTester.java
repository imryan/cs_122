package cs_122_School;

public class SchoolTester {

	public static void main(String[] args) {
		
		// Basic information
		Student student = new Student("John", "Doe");
		student.setAge(20);
		student.setAddress("41 Park Row, New York, NY 10038");
		
		// School information
		student.setSchoolName("Pace University");
		student.setDepartment("Computer Science");
		student.setEmailAddress("john.doe@pace.edu");
		student.setStudentId("U01174590");
		student.printObject();
		
		// Faculty information
		Faculty faculty = new Faculty("John", "Doe");
		faculty.setFacultyId("404");
		faculty.printObject();
	}
}