package fan;

public class Elite extends Fan{
	
	public double getContributionValue(ContributionSetup contributionSetup) {
		return contributionSetup.getEliteContribution();
	}
	
	public void showAllInformationFan(ContributionSetup contributionSetup) {
		
		getBasicInformationFan();
		System.out.println("Elite contribution amount: " + getContributionValue(contributionSetup));
		
		
	}
	
}
