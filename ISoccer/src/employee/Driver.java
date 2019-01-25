package employee;

public class Driver extends Employee {

	String enrollmentNumber;
	
	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}
	
	public String getEnrollmenteNumber() {
		return this.enrollmentNumber;
	}
	
	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		
		System.out.println("enrollmentNumber:");
		setEnrollmentNumber(input.nextLine());
		
	}
	
	public void showAllEmployeeData() {
		
		System.out.print("Driver");
		System.out.println("Enrollmente Number: " + getEnrollmenteNumber());
		showBasicInformation();
		
	}
	
}
