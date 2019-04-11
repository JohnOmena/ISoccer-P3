package system;
import fan.ContributionSetup;
import screen.Start;

public class CentralSystem {
	
	public static void main(String[] args) {
		
		Administrator adm = new Administrator();
		adm.createAccount();
		ContributionSetup contributionSetup = new ContributionSetup();
		
		Start start = new Start();
		start.startSystemScreen(adm, contributionSetup);
		
	}

}
