package fan;

public class Elite extends Fan{

	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getEliteContribution();
	}
	
}
