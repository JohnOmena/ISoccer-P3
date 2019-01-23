package database;
import java.util.ArrayList;
import java.util.Scanner;
import employee.Employee;
import employee.Player;
import employee.Technician;
import fan.ContributionSetup;
import fan.Fan;
import resource.Bus;
import resource.Resource;
import resource.Stadium;
import resource.TrainingCenter;
import useful.Utilities;

public class Database {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Fan> fans = new ArrayList<Fan>();
	ArrayList<Resource> resources = new ArrayList<Resource>();	
	Scanner input = new Scanner(System.in);
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public int getEmployeeNumber() {
		return this.employees.size();
	}

	public void addFan(Fan fan) {
		this.fans.add(fan);
	}
	
	public int getFanNumber() {
		return this.fans.size();
	}
	
	public void changePlayerAvailability() {
		
		System.out.println("What is the player's cpf?");
		String cpf = input.nextLine();
		
		for(Employee employee : this.employees) {
			
			if(employee.getCpf().equals(cpf)) {
				
				employee.setAvailable(Utilities.chooseAvailability());
				
			}
		}
		
	}
	
	public Resource searchAndObtainResource() {
		
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			String identify;
			
			Utilities.cleanScreen();
			System.out.println("Choose the resource type:");
			System.out.println("[1] Bus");
			System.out.println("[2] Stadium");
			System.out.println("[3] Training Center");
			
			int option = input.nextInt();
			input.nextInt();
			
			switch(option) {
				
				case 1:
					System.out.println("What is the car plate?");
					identify = input.nextLine();
					for(Resource resource : resources) {
						if(resource instanceof Bus && ((Bus) resource).getCarPlate().equals(identify)) {
							return resource;
						}
					}
					System.out.println("We do not have that bus, press any key to return to menu");
					input.nextLine();
					break; 
				case 2:
					System.out.println("What is the Stadium name?");
					identify = input.nextLine();
					for(Resource resource : resources) {
						if(resource instanceof Stadium && ((Stadium) resource).getStadiumName().equals(identify)) {
							resource.setAvailability(Utilities.chooseAvailability());
							return resource;
						}
					}
					System.out.println("We do not have this stadium, press any key to return to menu");
					input.nextLine();
					break;
				case 3:
					System.out.println("What is the Training Center name?");
					identify = input.nextLine();
					for(Resource resource : resources) {
						if(resource instanceof TrainingCenter && ((TrainingCenter) resource).getTrainingCenterName().equals(identify)) {
							resource.setAvailability(Utilities.chooseAvailability());
							return resource;
						}
					}
					System.out.println("We do not have this training center, press any key to return to menu");
					input.nextLine();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
				
		} while(flagFlow);
		
		return null;
		
	}
	
	public void addResource(Resource resource) {
		this.resources.add(resource);
	}
	
	public void teamMemberReport() {
		
		for(Employee employee : employees) {
			if(employee instanceof Technician) {
				employee.showAllEmployeeData();
			}
		}
		
		for(Employee employee : employees) {
			if(employee instanceof Player) {
				employee.showAllEmployeeData();
			}
		}
		
	}
	
	public void playerAvailabilityReport() {
		
		for(Employee employee : employees ) {
			if (employee instanceof Player) {
				System.out.println("Name:" + ((Player)employee).getName()
						+ "Player Type:" + ((Player)employee).getPlayerType()
						 );
				
			}
		}
		
	}
	
	public void allEmployerReport() {
		
		for(Employee employee : employees) {
			employee.showAllEmployeeData();
		}
		
	}
	
	public void stadiumTrainingCenterReport() {
		
		for(Resource resource : resources) {
			if(resource instanceof Stadium || resource instanceof TrainingCenter) {
				resource.showAllInformationResource();
			}
		}
		
		
	}
	
	public void transportReport() {
		
		for(Resource resource : resources) {
			if(resource instanceof Bus) {
				resource.showAllInformationResource();
			}
		}
		
	}
	
	public void allFanReport(ContributionSetup contributionSetup) {
		
		System.out.println("There are" + fans.size() + "fans");
		
		for(Fan fan : fans) {
			fan.getAllInformationFan(contributionSetup);
		}
		
	}
	
}
