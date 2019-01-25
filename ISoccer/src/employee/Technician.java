package employee;

public class Technician extends Employee {
	
	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		
	}

	public void showAllEmployeeData() {
		
		System.out.print("Technician:");
		showBasicInformation();
		
	}
	
}
