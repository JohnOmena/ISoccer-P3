package fan;

import java.util.Scanner;

import useful.Utilities;

public class Fan {
	
	Scanner input = new Scanner(System.in);
	public String name;
	public String email;
	public String cpf;
	public String phoneNumber;
	public String adress;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setFanData() {
		
		System.out.println("Name:");
		setName(input.nextLine());
		
		System.out.println("E-mail:");
		setEmail(input.nextLine());
		
		System.out.println("CPF:");
		setCpf(input.nextLine());
		
		System.out.println("Phone number:");
		setPhoneNumber(input.nextLine());
		
		System.out.println("Adress:");
		setAdress(input.nextLine());
		
	}
	
	public Fan typeOfFan(Fan fan) {
		
		boolean flagFlow;
		
		do {	
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of fan:");
			System.out.println("[1] Junior");
			System.out.println("[2] Senior");
			System.out.println("[3] Elite");
			
			int option = input.nextInt();
			input.nextLine();
			
			switch(option) {
			
				case 1:
					fan = new Junior();
					break; 
				case 2:
					fan = new Senior();
					break;
				case 3:
					fan = new Elite();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
		
			
		} while(flagFlow);
		
		return fan;
		
	}
	
	public void getBasicInformationFan() {
		
		System.out.println("Name: " + getName()
						+ "Email: " + getEmail()
						+ "CPF: " + getCpf()
						+ "PhoneNumber: " + getPhoneNumber()
						+  "Adress: " + getAdress());
		
	}
	
	public void showAllInformationFan(ContributionSetup contributionSetup) {
		
	}
	
}
