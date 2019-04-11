package screen;
import java.util.InputMismatchException;
import java.util.Scanner;
import fan.ContributionSetup;
import system.Administrator;
import useful.Utilities;

public class Start {
	
	static Scanner input = new Scanner(System.in);
	
	public void startSystemScreen(Administrator adm, ContributionSetup contributionSetup) {
		
		boolean flagFlow = false;
		boolean flagTest = true;
		
		do{
			
			Utilities.cleanScreen();
			System.out.println("-----------------------");
			System.out.println("#       ISoccer       #");
			System.out.println("-----------------------");
			System.out.println("[1] - Sign up");
			System.out.println("[2] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
			
			do{
				
				try{
				 
					int option = input.nextInt();
					input.nextLine();
					flagFlow = startSystemDecision(option, adm, contributionSetup);
					flagTest = false;
					
				}catch (InputMismatchException erro1) {
					
					input.nextLine();
					System.err.println("You are not allowed to enter letters, just enter integer! Try again:");
					
				}
				
			}while(flagTest);       
			
		} while(flagFlow);
			
	}
	
	public boolean startSystemDecision(int option, Administrator adm, ContributionSetup contributionSetup) {
		
		switch(option) {
		
			case 1:
				if(adm.verifyAccount()) {
					MenuSystem menuSystem = new MenuSystem();
					menuSystem.menuSystemScreen(contributionSetup);
				}
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a true option! Press enter to try again.");
				input.nextLine();
		}
	
		return true;
		
	}

}
