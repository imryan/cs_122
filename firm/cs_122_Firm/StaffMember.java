package cs_122_Firm;

abstract public class StaffMember {
	
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String toString() {
		return "";
	}
	
	public abstract double pay();
}