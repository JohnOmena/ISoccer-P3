package employee;

public class Player extends Employee {

	String playerType;
	boolean available;
	
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	
	public String getPlayerType() {
		return this.playerType;
	}
	
	public void setAvailable(boolean availabe) {
		this.available = availabe;
	}
	
	public boolean getAvailable() {
		return this.available;
	}
	
}
