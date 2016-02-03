package cs_122_Student;

public class Address implements AddressInterface {

	private String streetAddress;
	private String city;
	private String state;
	private String zip;

	public Address() {
		// I owe no return
	}

	public Address(String streetAddress, String city, String state, String zip) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String toString() {
		return streetAddress + ", " + city + ", " + state + " " + zip;
	}
}