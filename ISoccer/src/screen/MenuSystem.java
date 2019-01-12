package screen;
import java.util.Scanner;
import database.Database;
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
			System.out.println("[4] - Access Resource Menu");
			System.out.println("[5] - Access Report Menu");
			System.out.println("[6] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
	
			int option = input.nextInt();
			flagFlow = menuSystemDecision(option, database, contributionSetup);
			
		} while(flagFlow);
	
	}
	
	public boolean menuSystemDecision(int option, Database database, ContributionSetup contributionSetup) {
		
		switch(option) {
		
			case 1:
				database.addEmployee();
				break;
			case 2:
				Fan fan = 
				fan.setFanData();
				database.addFan(fan);
				break;
			case 3:
				contributionSetup.setContributionSetup();
				break;
			case 4:
				acessResourceMenu();
				break;
			case 5:
				acessReportMenu();
				break;
			case 6:
				return false;
			default:
				System.out.println("Choose a true option!");
		}
		
		System.out.println("\nPress any key to try again.");
		String pause = input.nextLine();
		return true;
		
	}
	
}
