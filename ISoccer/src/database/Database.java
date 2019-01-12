package database;
import java.util.ArrayList;
import employee.Employee;
import fan.Fan;

public class Database {

	ArrayList<Employee> employess = new ArrayList<Employee>();
	ArrayList<Fan> fans = new ArrayList<Fan>();
	
	public void addEmployee(Employee employee) {
		this.employess.add(employee);
	}
	
	public void addFan(Fan fan) {
		this.fans.add(fan);
	}
	
}
