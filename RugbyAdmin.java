/**
 * 
 */
package p2Monday40008228;

/**
 * @author Nicola
 * Rugby Admin Class
 *
 */
public class RugbyAdmin {

	/**
	 * 
	 */
	public RugbyAdmin() {
		
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Forward f1 = new Forward("Joe", 29, 150, "Irish", 50);
		Forward f2 = new Forward("John", 35, 140, "NZ", 120);
		
		Back b1 = new Back("Brian", 32, 130, "Irish", 30);
		Back b2 = new Back("Bob", 28, 87, "Welsh", 10.9);
		
		// use an array to show all players
		RugbyPlayer[] rugbyPlayers = {f1, f2, b1, b2};
		showAllDetailsToScreen(rugbyPlayers);
		
		//get all irish players
		showAllIrish(rugbyPlayers);
		
	}
	
	/**
	 * Method to show all rugby players to screen
	 * @param rugbyPlayers
	 */
	public static void showAllDetailsToScreen(RugbyPlayer[] rugbyPlayers)	{ //use an array
		//enhanced for loop
		for (RugbyPlayer rugbyPlayer : rugbyPlayers)	{
			System.out.println();
			rugbyPlayer.showAll();
		}
	}
	
	/**
	 * Get all irish players
	 * @param rugbyPlayers
	 */
	public static void showAllIrish (RugbyPlayer [] rugbyPlayers) {
		for (RugbyPlayer rugbyPlayer : rugbyPlayers)	{
			System.out.println();
			if (rugbyPlayer.getNationality().equalsIgnoreCase("Irish"))	{
				System.out.println(rugbyPlayer.getName());
			}
		}
		
		
	}

}
