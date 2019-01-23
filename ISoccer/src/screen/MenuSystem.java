package screen;
import java.util.Scanner;
import database.Database;
import employee.Employee;
import fan.ContributionSetup;
import fan.Fan;
import useful.Utilities;

public class MenuSystem {

	Scanner input = new Scanner(System.in);
	
	public void menuSystemScreen(Database database, ContributionSetup contributionSetup) {
		
		boolean flagFlow = true;
		
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
	
			int option = input.nextInt();
			flagFlow = menuSystemDecision(option, database, contributionSetup);
			
		} while(flagFlow);
	
	}
	
	public boolean menuSystemDecision(int option, Database database, ContributionSetup contributionSetup) {
		
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
				reportMenu.reportMenuScreen(database);
				break;			
			case 6:
				ResourceMenu resourceMenu = new ResourceMenu();
				resourceMenu.resourceMenuScreen(database);
				break;
			case 7:
				return false;
			default:
				System.out.println("Choose a true option, press any key to try again.");
				input.nextLine();
		}
		
		return true;
		
	}
	
}
