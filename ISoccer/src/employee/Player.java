package employee;
import java.util.InputMismatchException;

import useful.Utilities;

public class Player extends Employee {

	public String playerType;
	public boolean availability;
	
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	
	public String getPlayerType() {
		return this.playerType;
	}
	
	public void setAvailability(boolean availabe) {
		this.availability = availabe;
	}
	
	public boolean getAvailability() {
		return this.availability;
	}
	
	public String chooseTypePlayer() {
		
		boolean flagFlow;
		String playerType = null;
		
		do {	
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of player:");
			System.out.println("[1] Shuttlecock");
			System.out.println("[2] Defender");
			System.out.println("[3] Middle");
			System.out.println("[4] Goalkeeper");
			System.out.println("[5] Soccer Forward");
			System.out.println("[6] Left Side");
			System.out.println("[7] Right Side");	
			
			int option = 0;
			
			try {
				option = input.nextInt();
				input.nextLine();
			} catch(InputMismatchException error01) {
				input.nextLine();
				System.out.println("You are not allowed to enter letters, just enter integer!");
			}
			
			switch(option) {
			
				case 1:
					playerType = "Shuttlecock";
					break; 
				case 2:
					playerType = "Defender";
					break;
				case 3:
					playerType = "Middle";
					break;
				case 4:
					playerType = "Goalkeeper";
					break;
				case 5:
					playerType = "Soccer Forward";
					break;
				case 6:
					playerType = "Left Side";
					break;
				case 7:
					playerType = "Right Side";
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
				
		} while(flagFlow);
		
		return playerType;
		
	}
	
	public void showAllEmployeeData() {
		

		System.out.print("\nPlayer Type: " + getPlayerType() 
						+ "\nAvailability: " + getAvailability());
		showBasicInformation();
	
	}
	
	public void obtainEmployeeComplete() {
		
		setEmployeeData();
		setPlayerType(chooseTypePlayer());
		
	}
	
}
