package fan;

public class Senior extends Fan {

	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getSeniorContribution();
	}

	public void showAllInformationFan(ContributionSetup contributionSetup) {
		
		getBasicInformationFan();
		System.out.println("Senior contribution amount: " + getContributionValue(contributionSetup));
		
	}
	
}
