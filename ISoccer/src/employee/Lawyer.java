package employee;

public class Lawyer extends Employee {

	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		
	}
	
	public void showAllEmployeeData(Employee employee) {
		
		employee.showBasicInformation(employee);
		
	}
	
}
