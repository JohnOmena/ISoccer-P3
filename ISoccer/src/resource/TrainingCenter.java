package resource;

public class TrainingCenter extends Resource {

	public String trainingCenterName;
	public int totalDormitory;
	
	public void setTrainingCenterName(String trainingCenterName) {
		this.trainingCenterName = trainingCenterName;
	}
	
	public String getTrainingCenterName() {
		return this.trainingCenterName;
	}
	
	public void setTotalDormitory(int totalDormitory) {
		this.totalDormitory = totalDormitory;
	}
	
	public int getTotalDormitory() {
		return this.totalDormitory;
	}
	
	public void obtainResourceComplete() {
		
		System.out.println("How many dorms?");
		setTotalDormitory(input.nextInt());
		
		System.out.println("What is the training center name?");
		setTrainingCenterName(input.nextLine());
		
	}
	
	public void changeResourceCapacity() {
		
	}
	
}
