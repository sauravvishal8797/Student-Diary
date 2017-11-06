package Details;

public class PersonalDetails {
	
	private String Name;
	private String DateOfBirth;
	private String Gender;
	private String EmailId;
	private Address address;
	private boolean Hostelite;
	private String BloodGroup;
	private String PhoneNo;
	private String MotherTongue;
	private GuardianContactType contact;
	
	public PersonalDetails(String Name, String DateOfBirth, String Gender, String EmailId, Address address, boolean Hostelite, String BloodGroup, String PhoneNo, String MotherTongue, GuardianContactType contact) {
		this.Name = Name;
		this.DateOfBirth = DateOfBirth;
		this.Gender = Gender;
		this.EmailId = EmailId;
		this.address = address;
		this.Hostelite = Hostelite;
		this.BloodGroup = BloodGroup;
		this.PhoneNo = PhoneNo;
		this.MotherTongue = MotherTongue;
		this.contact = contact;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String getEmailId() {
		return EmailId;
	}
	
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean isHostelite() {
		return Hostelite;
	}
	
	public void setHostelite(boolean hostelite) {
		Hostelite = hostelite;
	}
	
	public String getBloodGroup() {
		return BloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	
	public String getPhoneNo() {
		return PhoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	public String getMotherTongue() {
		return MotherTongue;
	}
	
	public void setMotherTongue(String motherTongue) {
		MotherTongue = motherTongue;
	}
	
	public GuardianContactType getContact() {
		return contact;
	}
	
	public void setContact(GuardianContactType contact) {
		this.contact = contact;
	}
	
	
	
	

}
