package fan;

public class Junior extends Fan {
	
	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getJuniorContribution();
	}
	
}
