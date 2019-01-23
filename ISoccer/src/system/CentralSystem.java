package system;
import database.Database;
import fan.ContributionSetup;
import screen.Start;

public class CentralSystem {
	
	public static void main(String[] args) {
		
		Administrator adm = new Administrator();
		adm.createAccount();
		Database database = new Database();
		ContributionSetup contributionSetup = new ContributionSetup();
		
		Start start = new Start();
		start.startSystemScreen(adm, database, contributionSetup);
		
	}

}
