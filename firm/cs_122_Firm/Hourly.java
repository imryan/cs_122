package cs_122_Firm;

public class Hourly extends Employee {

	private int hoursWorked;
	
	public Hourly(String name, String address, String phone, String social, double rate) {
		super(name, address, phone, social, rate);
		hoursWorked = 0;
	}
	
	public void addHours(int hours) {
		hoursWorked += hours;
	}
	
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "Hours worked:\t\t" + hoursWorked;
		
		return result;
	}
}
