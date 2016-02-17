package cs_122_School;

public class Person implements PersonInterface {
	
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printObject() {
		System.out.println("----------------------------------------");
		System.out.println("Name:\t\t" + firstName + " " + lastName);
		System.out.println("Address:\t" + address);
		System.out.println("Age:\t\t" + age);
		System.out.println("----------------------------------------");
	}
}
