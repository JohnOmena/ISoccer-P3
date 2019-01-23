package screen;
import java.util.Scanner;
import database.Database;
import resource.Resource;
import useful.Utilities;

public class ResourceMenu {

	Scanner input = new Scanner(System.in);
	
	public void resourceMenuScreen(Database database) {
		
		boolean flagFlow = true;
		
		do{
			Utilities.cleanScreen();
			System.out.println("-----------------------------");
			System.out.println("#   ISoccer - Resource Menu   #");
			System.out.println("-----------------------------");
			System.out.println("[1] - Add Resource");
			System.out.println("[2] - Verify Availability Resource");
			System.out.println("[3] - Change Resource Capacity");
			System.out.println("[4] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
	
			int option = input.nextInt();
			input.nextInt();
			
			flagFlow = resourceMenuDecision(option, database);
			
		} while(flagFlow);
	
	}
	
	public boolean resourceMenuDecision(int option, Database database) {
		
		Resource resource = new Resource();
		
		switch(option) {
			
			case 1:
				resource = resource.typeOfResource();
				resource.obtainResourceComplete();
				database.addResource(resource);
				break;
			case 2:
				resource = database.searchAndObtainResource();
				if(resource != null) {
					resource.setAvailability(Utilities.chooseAvailability());
				}
				break;
			case 3:
				resource = database.searchAndObtainResource();
				if(resource != null) {
					resource.changeResourceCapacity();
				}
				break;
			case 4:
				return false;
			default:
				System.out.println("Choose a true option, press any key to try again.");
				input.nextLine();
		}

		return true;
		
	}

	
}	
