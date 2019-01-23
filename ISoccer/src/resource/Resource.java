package resource;
import java.util.Scanner;

import useful.Utilities;

public class Resource {

	boolean availability;
	Scanner input = new Scanner(System.in);
	
	public Resource() {
		this.availability = true;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public boolean getAvailability() {
		return this.availability;
	}
	
	public Resource typeOfResource() {
		
		Resource resource = null;
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of resource:");
			System.out.println("[1] Bus");
			System.out.println("[2] Stadium");
			System.out.println("[3] Training Center");
			
			int option = input.nextInt();
			input.nextLine();
			
			switch(option) {
			
				case 1:
					resource = new Bus();
					break; 
				case 2:
					resource = new Stadium();
					break;
				case 3:
					resource = new TrainingCenter();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		return resource;
	
	}
	
	public void changeResourceCapacity() {
		
	}
	
	public void obtainResourceComplete() {
	}
	
	public void showBasicInformationResource() {
		
		System.out.println("Availability: " + getAvailability());
		
	}
	
	public void showAllInformationResource() {	
		
	}
	
}
