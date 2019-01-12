package useful;
import java.util.Scanner;

public class Utilities {
	
	Scanner input = new Scanner(System.in);
	
	public static void cleanScreen() {
		for (int i = 0; i < 50; ++i) {
		    System.out.println ();
		}
	}
	
	public boolean yesOrNo() {
		
		System.out.println("[1] YES");
		System.out.println("[2] NO");
		System.out.println("=> Choose an option: ");
		
		int option = input.nextInt();
		
		if (option == 1) {
			return true;
		}
		else {
			return false;
		}
	
	}

}
