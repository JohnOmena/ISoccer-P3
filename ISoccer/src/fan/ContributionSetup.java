package fan;

import java.util.Scanner;

public class ContributionSetup {
	
	public Double juniorContribution;
	public Double seniorContribution;
	public Double eliteContribution;
	Scanner input = new Scanner(System.in);
	
	public void setJuniorContribution(Double juniorContribution) {
		this.juniorContribution = juniorContribution;
	}
	
	public Double getJuniorContribution() {
		return this.juniorContribution;
	}
	
	public void setSeniorContribution(Double seniorContribution) {
		this.seniorContribution = seniorContribution;
	}
	
	public Double getSeniorContribution() {
		return this.seniorContribution;
	}
	
	public void setEliteContribution(Double eliteContribution) {
		this.eliteContribution = eliteContribution;
	}
	
	public Double getEliteContribution() {
		return this.eliteContribution;
	}
	
	public void setContributionSetup() {
		
		System.out.println("What is the contribution of the junior type?");
		setJuniorContribution(input.nextDouble());
		
		System.out.println("What is the contribution of the senior type?");
		setSeniorContribution(input.nextDouble());
		
		System.out.println("What is the contribution of the elite type?");
		setEliteContribution(input.nextDouble());
		
	}
	
}
