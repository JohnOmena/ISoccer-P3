package employee;

public class Doctor extends Employee {

	String crm;
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public String getCrm() {
		return this.crm;
	}
	
	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		
		System.out.println("CRM:");
		setCrm(input.nextLine());
		
	}
	
	public void showAllEmployeeData() {
		
		showBasicInformation();
		
		System.out.println("CRM: " + getCrm());
		
	}
	
}
