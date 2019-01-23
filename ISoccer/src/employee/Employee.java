package employee;
import java.util.Scanner;
import useful.Utilities;

public class Employee {

	Scanner input = new Scanner(System.in);
	public String name;
	public String email;
	public String cpf;
	public double salary;
	public String phoneNumber;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void showBasicInformation() {
	
		System.out.println("Name: " + getName()
						+ "Email: " + getEmail()
						+ "CPF: " + getCpf()
						+ "Salary: " + getSalary()
						+ "phoneNumber: " + getPhoneNumber());
	
	}			
	
	public Employee typeOfEmployee() {
		
		Employee employee = null;
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of employee:");
			System.out.println("[1] Cooker");
			System.out.println("[2] Doctor");
			System.out.println("[3] Driver");
			System.out.println("[4] Lawyer");
			System.out.println("[5] PersonalTrainer");
			System.out.println("[6] Player");
			System.out.println("[7] President");
			System.out.println("[8] Technician");
			
			int option = input.nextInt();
			input.nextInt();
			
			switch(option) {
			
				case 1:
					employee = new Cooker();
					break; 
				case 2:
					employee = new Doctor();
					break;
				case 3:
					employee = new Driver();
					break;
				case 4:
					employee = new Lawyer();
					break;
				case 5:
					employee = new PersonalTrainer();
					break;
				case 6:
					employee = new Player();
					break;
				case 7:
					employee = new President();
					break;
				case 8:
					employee = new Technician();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		return employee;
		
	}
	
	public void setEmployeeData() {
		
		System.out.println("Name:");
		setName(input.nextLine());
		
		System.out.println("E-mail:");
		setEmail(input.nextLine());
		
		System.out.println("CPF:");
		setCpf(input.nextLine());
		
		System.out.println("Salary:");
		setSalary(input.nextDouble());
		input.nextLine();
		
		System.out.println("Phone Number:");
		setPhoneNumber(input.nextLine());
		
	}
	
	public void obtainEmployeeComplete() {
	}
	
	public void setAvailable(boolean availabe) {	
	}
	
	public void showAllEmployeeData() {	
	}
	
}
