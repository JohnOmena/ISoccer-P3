package screen;
import java.util.Scanner;
import database.Database;
import fan.ContributionSetup;
import system.Administrator;
import useful.Utilities;

public class Start {
	
	static Scanner input = new Scanner(System.in);
	
	public void startSystemScreen(Administrator adm, Database database, ContributionSetup contributionSetup) {
		
		boolean flagFlow = true;
		
		do{
			Utilities.cleanScreen();
			System.out.println("-----------------------");
			System.out.println("#       ISoccer       #");
			System.out.println("-----------------------");
			System.out.println("[1] - Sign up");
			System.out.println("[2] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
			
			int option = input.nextInt();
			flagFlow = startSystemDecision(option, adm, database, contributionSetup);
		
		} while(flagFlow);
			
	}
	
	public boolean startSystemDecision(int option, Administrator adm, Database database, ContributionSetup contributionSetup) {
		
		switch(option) {
		
			case 1:
				if(adm.verifyAccount()) {
					MenuSystem menuSystem = new MenuSystem();
					menuSystem.menuSystemScreen(database, contributionSetup);
				}
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a true option!");
		}
		
		System.out.println("\nPress any key to try again.");
		String pause = input.nextLine();
		return true;
		
	}

}
