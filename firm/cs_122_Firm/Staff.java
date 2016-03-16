package cs_122_Firm;

public class Staff {
	private StaffMember[] staffList;
	
	public Staff() {
		staffList = new StaffMember[1];
		
		staffList[0] = new Employee("John Doe", "41 Park Row New York, NY", "(212) 555-1234", "140-02-3666", 8.25);
	}
	
	public void payday() {
		double amount = 0.0;
		
		for (int i = 0; i < staffList.length; i++) {
			System.out.println("Staff: " + staffList[i]);
			amount = staffList[i].pay();
			
			if (amount == 0) {
				System.out.println("Staff: Thanks!");
			} else {
				System.out.println("Staff Paid: $" + amount);
				System.out.println("-------------------------");
			}
		}
	}
}
