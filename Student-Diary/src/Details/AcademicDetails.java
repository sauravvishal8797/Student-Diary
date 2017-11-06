package Details;

import java.util.Date;

public class AcademicDetails {
	
	private String Name;
	private String AcademicProgram;
	private String JoiningYear;
	private String GraduationYear;
	private String Branch;
	private Date DateOfEnrollment;
	private String EnrollmentStatus;
	private String CurrentSemester;
	private String AdmissionType;
	private String AdmissionNo;
	private String ApplicationNo;
	private String EntranceRank;
	
	public AcademicDetails() {
		
		
	}
	
	public AcademicDetails(String Name, String AcademicProgram, String JoiningYear, String GraduationYear, String Branch, Date DateOfEnrollment, String EnrollmentStatus, String CurrentSemester, String AdmissionType, String AdmissionNo, String ApplicationNo, String EntranceRank) {
		
		this.Name = Name;
		this.AcademicProgram = AcademicProgram;
		this.JoiningYear = JoiningYear;
		this.GraduationYear = GraduationYear;
		this.Branch = Branch;
		this.EnrollmentStatus = EnrollmentStatus;
		this.DateOfEnrollment = DateOfEnrollment;
		this.CurrentSemester = CurrentSemester;
		this.AdmissionType = AdmissionType;
		this.AdmissionNo = AdmissionNo;
		this.ApplicationNo = ApplicationNo;
		this.EntranceRank = EntranceRank;
		
		
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAcademicProgram(String AcademicProgram) {
		this.AcademicProgram = AcademicProgram;
	}
	
	public void setJoiningYear(String JoiningYear) {
		this.JoiningYear = JoiningYear;
	}
	
	public void setGraduationYear(String GraduationYear) {
		this.GraduationYear = GraduationYear;
	}
	
	public void setBranch(String Branch) {
		this.Branch = Branch;
	}
	
	public void setDateOfEnrollment(Date DateOfEnrollment) {
		this.DateOfEnrollment = DateOfEnrollment;
	}
	
	public void setCurrentSemester(String CurrentSemester) {
		this.CurrentSemester = CurrentSemester;
	}
	
	public void setAdmissionType(String AdmissionType) {
		this.AdmissionType = AdmissionType;
	}
	
	public void setAdmissionNo(String AdmissionNo) {
		this.AdmissionNo = AdmissionNo;
	}
	
	public void setEnrollmentStatus(String EnrollmentStatus) {
		this.EnrollmentStatus = EnrollmentStatus;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setApplicationNo(String ApplicationNo) {
		this.ApplicationNo = ApplicationNo;
	}
	
	public void setEntranceRank(String EntranceRank) {
		this.EntranceRank = EntranceRank;
	}
	
	public String getAcademicProgram() {
		return AcademicProgram;
	}
	
	public String getJoiningYear() {
		return JoiningYear;
	}
	
	public String getGraduationYear() {
		return GraduationYear;
	}
	
	public String getBranch() {
		return Branch;
	}
	
	public Date getDateOfEnrollment() {
		return DateOfEnrollment;
	}
	
	public String getCurrentSemester() {
		return CurrentSemester;
	}
	
	public String getAdmissionType() {
		return AdmissionType;
	}
	
	public String getAdmissionNo() {
		return AdmissionNo;
	}
	
	public String getApplicationNo() {
		return ApplicationNo;
	}
	
	public String getEntranceRank() {
		return EntranceRank;
	}
	
	public String getEnrollmentStatus() {
		return EnrollmentStatus;
	}
	
	public String toString() {
		return "Name: " + this.getName() + "\t" +  "Academic Program: " + this.getAcademicProgram() + "\n"
				+ "Joining Year: " + this.getJoiningYear() + "\t" + "Graduation Year: " + this.getGraduationYear() + "\n"
				+ "Branch Enrolled: " + this.getBranch() + "\t" + "Current Semester: " + this.getCurrentSemester() + "\n"
				+ "Date Of Enrollment: " + String.valueOf(this.getDateOfEnrollment()) + "\t" + "AdmissionType: " + this.getAdmissionType() + "\n"
				+ "AdmissionNo: " + this.getAdmissionNo() + "\t" + "ApplicationNo: " + this.getApplicationNo() + "\n"
				+ "AmritaEntranceRank: " + this.getEntranceRank() + "\t" + "Enrollment Status: " + this.getEnrollmentStatus();
	}

}
