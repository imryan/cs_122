package cs_122_School;

public interface StudentInterface {

	public void setSchoolName(String schoolName);
	public void setEmailAddress(String emailAddress);
	public void setDepartment(String department);
	
	public String getSchoolName();
	public String getEmailAddress();
	public String getDepartment();
	
	public void printObject();
}
