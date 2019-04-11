package screen;
import java.util.InputMismatchException;
import java.util.Scanner;
import database.DatabaseSingleton;
import employee.Employee;
import fan.ContributionSetup;
import fan.Fan;
import useful.Utilities;

public class MenuSystem {

	Scanner input = new Scanner(System.in);
	
	public void menuSystemScreen(ContributionSetup contributionSetup) {
		
		boolean flagFlow = true;
		boolean flagTest = true;
		
		do{
			Utilities.cleanScreen();
			System.out.println("-----------------------");
			System.out.println("#       ISoccer       #");
			System.out.println("-----------------------");
			System.out.println("[1] - Add Employee");
			System.out.println("[2] - Add Fan");
			System.out.println("[3] - Set Contribution Setup");
			System.out.println("[4] - Change Player Availability");
			System.out.println("[5] - Access Report Menu");
			System.out.println("[6] - Access Resource Menu");
			System.out.println("[7] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");

			
			do{
				
				try{
				 
					int option = input.nextInt();
					flagFlow = menuSystemDecision(option, contributionSetup);
					input.nextLine();
					flagTest = false;
					
				}catch (InputMismatchException erro1) {
					
					input.nextLine();
					System.err.println("You are not allowed to enter letters, just enter integer! Try again:");
					
				}
				
			}while(flagTest);  
			
		} while(flagFlow);
	
	}
	
	public boolean menuSystemDecision(int option, ContributionSetup contributionSetup) {
		
		DatabaseSingleton database = DatabaseSingleton.getInstance();
		
		switch(option) {
		
			case 1:
				Employee employee = new Employee();
				employee = employee.typeOfEmployee();
				employee.obtainEmployeeComplete();
				database.addEmployee(employee);
				break;
			case 2:
				if(database.getFanNumber() == 0) {	
					Utilities.cleanScreen();
					System.out.println("First, we need this information:");
					contributionSetup.setContributionSetup();
				}
				
				Fan fan = new Fan(); 
				fan	= fan.typeOfFan(fan);
				fan.setFanData();
				database.addFan(fan);
				break;
			case 3:
				contributionSetup.setContributionSetup();
				break;
			case 4:
				database.changePlayerAvailability();
				break;
			case 5:
				ReportMenu reportMenu = new ReportMenu();
				reportMenu.reportMenuScreen(contributionSetup);
				break;			
			case 6:
				ResourceMenu resourceMenu = new ResourceMenu();
				resourceMenu.resourceMenuScreen();
				break;
			case 7:
				return false;
			default:
				System.out.println("\nChoose a true option, press enter to try again.");
				input.nextLine();
		}
		
		return true;
		
	}
	
}