package Details;

public class GuardianContactType {
	
	private String GuardianName;
	private Address GuardianAddress;
	private String GuardianPhoneNo;
	private String GuardianEmailId;
	
	public GuardianContactType(String Name, Address adress, String Phone, String Email) {
		GuardianName = Name;
		GuardianAddress = adress;
		GuardianPhoneNo = Phone;
		GuardianEmailId = Email;
		
	}
	
	public String getGuardianName() {
		return GuardianName;
	}
	public void setGuardianName(String guardianName) {
		GuardianName = guardianName;
	}
	public Address getGuardianAddress() {
		return GuardianAddress;
	}
	public void setGuardianAddress(Address guardianAddress) {
		GuardianAddress = guardianAddress;
	}
	public String getGuardianPhoneNo() {
		return GuardianPhoneNo;
	}
	public void setGuardianPhoneNo(String guardianPhoneNo) {
		GuardianPhoneNo = guardianPhoneNo;
	}
	public String getGuardianEmailId() {
		return GuardianEmailId;
	}
	public void setGuardianEmailId(String guardianEmailId) {
		GuardianEmailId = guardianEmailId;
	}
	
	

}
