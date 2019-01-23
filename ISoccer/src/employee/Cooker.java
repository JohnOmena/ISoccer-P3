package employee;

public class Cooker extends Employee {

	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		
	}
	
	public void showAllEmployeeData(Employee employee) {
		
		employee.showBasicInformation(employee);
		
	}

}
