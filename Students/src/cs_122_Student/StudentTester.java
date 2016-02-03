package cs_122_Student;

public class StudentTester {

	public static void main(String[] args) {
		Address home = new Address("182 Broadway", "New York", "NY", "10038");
		Address school = new Address("1 Pace Plaza", "New York", "NY", "10038");
		Student student = new Student("John", "Doe", home, school);

		System.out.println(student);
	}
}
