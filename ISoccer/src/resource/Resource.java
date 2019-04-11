package resource;
import java.util.InputMismatchException;
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
		ResourceFactory resourceFactory = null;
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of resource:");
			System.out.println("[1] Bus");
			System.out.println("[2] Stadium");
			System.out.println("[3] Training Center");
			
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
					resourceFactory = new BusFactory();
					break; 
				case 2:
					resourceFactory = new StadiumFactory();
					break;
				case 3:
					resourceFactory = new TrainingCenterFactory();
					break;
				default:
					System.out.println("Choose a true option, press enter to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		resource = resourceFactory.createResource();
		
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