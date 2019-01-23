package resource;

public class TrainingCenter extends Resource {

	public String trainingCenterName;
	public int Bedroms;
	
	public void setTrainingCenterName(String trainingCenterName) {
		this.trainingCenterName = trainingCenterName;
	}
	
	public String getTrainingCenterName() {
		return this.trainingCenterName;
	}
	
	public void setTotalBedroms(int Bedroms) {
		this.Bedroms = Bedroms;
	}
	
	public int getTotalBedroms() {
		return this.Bedroms;
	}
	
	public void obtainResourceComplete() {
		
		System.out.println("How many dorms?");
		setTotalBedroms(input.nextInt());
		
		System.out.println("What is the training center name?");
		setTrainingCenterName(input.nextLine());
		
	}
	
	public void changeResourceCapacity() {
		
	}
	
	public void showAllInformationResource(){
		showBasicInformationResource();
		System.out.println("Training center name: " + getTrainingCenterName()
						+ "Bedroms: " + getTotalBedroms());
	}
	
}
