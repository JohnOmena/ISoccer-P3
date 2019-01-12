package fan;

public class Senior extends Fan {

	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getSeniorContribution();
	}
	
}
