package cs_122_Firm;

public class Employee extends StaffMember {
	
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String name, String address, String phone, String social, double rate) {
		super(name, address, phone);
		socialSecurityNumber = social;
		payRate = rate;
	}
	
	public String toString() {
		String result = "---------------------------\n";
		result += "SSN:\t\t" + socialSecurityNumber + "\n" + "Payrate:\t$" + payRate;
		return result;
	}
	
	public double pay() {
		return payRate;
	}
}
