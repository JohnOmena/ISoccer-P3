package resource;

public class Bus extends Resource{
	
	public int totalChairs;
	public String carPlate;
	
	public void setTotalChairs(int totalChairs) {
		this.totalChairs = totalChairs;
	}
	
	public int getTotalChairs() {
		return this.totalChairs;
	}
	
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
	
	public void obtainResourceComplete() {
	
		System.out.println("How many seats?");
		setTotalChairs(input.nextInt());
		
		input.nextLine();
		
		System.out.println("What is the car plate?");
		setCarPlate(input.nextLine());
		
	}
	
	public void changeResourceCapacity() {
		
		System.out.println("What is the new number of seats?");
		setTotalChairs(input.nextInt());
		
	}
	
	public void showAllInformationResource() {
		
		System.out.println("\nCar plate: " + getCarPlate()
						+ "\nChair: " + getTotalChairs());
		
		showBasicInformationResource();
		
	}
	
}
