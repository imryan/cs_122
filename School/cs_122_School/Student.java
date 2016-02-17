package cs_122_School;

public class Student extends Person implements StudentInterface {

	protected String studentId;
	private String schoolName;
	private String emailAddress;
	private String department;
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getDepartment() {
		return department;
	}
	
	public void printObject() {
		super.printObject();
		
		System.out.println("ID:\t\t" + studentId);
		System.out.println("School:\t\t" + schoolName);
		System.out.println("Email:\t\t" + emailAddress);
		System.out.println("Dept:\t\t" + department);
		System.out.println("----------------------------------------");
	}
}
