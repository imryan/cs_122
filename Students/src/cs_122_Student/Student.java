package cs_122_Student;

public class Student implements StudentInterface {

	private String firstName;
	private String lastName;

	private Address homeAddress;
	private Address schoolAddress;

	public Student() {
		// Can't touch
	}

	public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}

	public String toString() {
		String result = "\nName:\t\t" + firstName + " " + lastName + "\n";
		result += "Home Address:\t" + homeAddress + "\n";
		result += "School Address:\t" + schoolAddress + "\n";

		return result;
	}
}
