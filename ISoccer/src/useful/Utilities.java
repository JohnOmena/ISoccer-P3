package useful;
import java.util.Scanner;

public class Utilities {
	
	static Scanner input = new Scanner(System.in);
	
	public static void cleanScreen() {
		for (int i = 0; i < 50; ++i) {
		    System.out.println ();
		}
	}
	
	public static boolean chooseAvailability() {
		
		boolean flagFlow;
		boolean availability = false;
		
		do {
			
			flagFlow = false;
			
			System.out.println("Choose an option:");
			System.out.println("[1] Available");
			System.out.println("[2] Unavailable");
		
			int option = input.nextInt();
			input.nextLine();
				
			switch(option) {
				
				case 1:
					availability = true;
					break;
				case 2:
					availability = false;
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		return availability;
		
	}
	
	public boolean yesOrNo() {
		
		System.out.println("[1] YES");
		System.out.println("[2] NO");
		System.out.println("=> Choose an option: ");
		
		int option = input.nextInt();
		
		if (option == 1) {
			return true;
		}
		else {
			return false;
		}
	
	}

	public static void pauseBeforeMenu() {
		
		System.out.println("\nPress any key to return to the menu");
		input.nextLine();
		
	}
	
}
