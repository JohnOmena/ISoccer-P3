package fan;

public class Junior extends Fan {
	
	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getJuniorContribution();
	}
	
	public void getAllInformationFan(ContributionSetup contributionSetup) {
		
		getBasicInformationFan();
		System.out.println("Junior contribution amount: " + getContributionValue(contributionSetup));
		
	}
	
}
