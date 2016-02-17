package cs_122_School;

public interface PersonInterface {
	
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
	public void setAddress(String address);
	public void setAge(int age);
	
	public String getFirstName();
	public String getLastName();
	public String getAddress();
	public int getAge();
	
	public void printObject();
}
