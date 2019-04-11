package screen;
import java.util.InputMismatchException;
import java.util.Scanner;
import database.DatabaseSingleton;
import fan.ContributionSetup;
import useful.Utilities;

public class ReportMenu {

	Scanner input = new Scanner(System.in);
	
	public void reportMenuScreen(ContributionSetup contributionSetup) {
		
		boolean flagFlow = true;
		boolean flagTest = true;
		
		do{
			Utilities.cleanScreen();
			System.out.println("-----------------------------");
			System.out.println("#   ISoccer - Report Menu   #");
			System.out.println("-----------------------------");
			System.out.println("[1] - Report of the team members");
			System.out.println("[2] - Player Availability Report");
			System.out.println("[3] - Report of all employees");
			System.out.println("[4] - Stadium and Training Center Report");
			System.out.println("[5] - Transport Report");
			System.out.println("[6] - Report of all fans");
			System.out.println("[7] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
	
			do{
				
				try{
				 
					int option = input.nextInt();
					input.nextLine();
					flagFlow = reportMenuDecision(option, contributionSetup);
					flagTest = false;
					
				}catch (InputMismatchException erro1) {
					
					input.nextLine();
					System.err.println("You are not allowed to enter letters, just enter integer! Try again:");
					
				}
				
			}while(flagTest);
			
		} while(flagFlow);
	
	}
	
	public boolean reportMenuDecision(int option, ContributionSetup contributionSetup) {
			
		DatabaseSingleton database = DatabaseSingleton.getInstance();
		
		switch(option) {
			
			case 1:
				database.teamMemberReport();
				break;
			case 2:
				database.playerAvailabilityReport();
				break;
			case 3:
				database.allEmployerReport();
				break;
			case 4:
				database.stadiumTrainingCenterReport();
				break;
			case 5:
				database.transportReport();
				break;
			case 6:
				database.allFanReport(contributionSetup);
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
