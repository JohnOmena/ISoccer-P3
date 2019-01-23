package fan;

public class Senior extends Fan {

	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getSeniorContribution();
	}

	public void getAllInformationFan(ContributionSetup contributionSetup) {
		
		getBasicInformationFan();
		System.out.println("Senior contribution amount: " + getContributionValue(contributionSetup));
		
	}
	
}
