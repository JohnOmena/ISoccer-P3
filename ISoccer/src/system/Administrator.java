package system;
import java.util.Scanner;

public class Administrator {

	Scanner input = new Scanner(System.in);
	public String userAccount;
	public String password;
	
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	public String getUserAccount() {
		return this.userAccount;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void createAccount() {
		
		System.out.println("Enter username:");
		setUserAccount(input.nextLine());
		
		System.out.println("Type the password:");
		setPassword(input.nextLine());
		
	}
	
	public boolean verifyAccount() {
		
		System.out.println("Enter username:");
		String userAccount = input.nextLine();
		
		System.out.println("Type the password:");
		String password = input.nextLine();
		
		if(this.userAccount.equals(userAccount) && this.password.equals(password)) {
			return true;
		} 
		
		System.out.println("Incorrect userAccount or password, press enter to continue.");
		input.nextLine();
	
		return false;
		
	}
	
}
