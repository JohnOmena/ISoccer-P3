package resource;

public class Stadium extends Resource{
	
	public int fanCapacity;
	public int totalSnackBar;
	public int totalToilet;
	public String stadiumName;
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public String getStadiumName() {
		return this.stadiumName;
	}
	
	public void setFanCapacity(int fanCapacity) {
		this.fanCapacity = fanCapacity;
	}
	
	public int getFanCapacity() {
		return this.fanCapacity;
	}
	
	public void setTotalSnackBar(int totalSnackBar) {
		this.totalSnackBar = totalSnackBar;
	}
	
	public int getTotalSnackBar() {
		return this.totalSnackBar;
	}
	
	public void setTotalToilet(int totalToilet) {
		this.totalToilet = totalToilet;
	}
	
	public int getTotalToilet() {
		return this.totalToilet;
	}
	
	public void obtainResourceComplete() {
		
		System.out.println("What is the capacity of fans?");
		setFanCapacity(input.nextInt());
		
		System.out.println("How many snack bars?");
		setTotalSnackBar(input.nextInt());
		
		System.out.println("How many toilets?");
		setTotalToilet(input.nextInt());
		
		input.nextLine();
		
		System.out.println("What is the stadium name?");
		setStadiumName(input.nextLine());
		
	}
	
	public void changeResourceCapacity() {
		
		System.out.println("What is the new number of capacity fans?");
		setFanCapacity(input.nextInt());
		
		System.out.println("What is the new number of capacity snack bars?");
		setTotalSnackBar(input.nextInt());
		
		System.out.println("What is the new number of capacity toilets?");
		setTotalToilet(input.nextInt());
		
	}
	
	public void showAllInformationResource() {
		
		System.out.println("\nStadium name: " + getStadiumName()
						+ "\nFan capacity:" + getFanCapacity()
						+ "\nTotal snack bar: " + getTotalSnackBar()
						+ "\nTotal toilet: " + getTotalToilet());
		
		showBasicInformationResource();
		
	}
	
}
