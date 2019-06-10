/**
 * 
 */
package p2Monday40008228;

/**
 * @author Nicola
 *
 */
public class Back extends RugbyPlayer {
	
	private double maxSpeed;

	/**
	 * Default constructor
	 */
	public Back() {
		
	}

	/**
	 * constructor using args
	 * @param name
	 * @param age
	 * @param weight
	 * @param nationality
	 */
	public Back(String name, int age, double weight, String nationality, double maxSpeed) {
		super(name, age, weight, nationality);
		this.maxSpeed = maxSpeed;
		
	}

	/**
	 * @return the maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Displays all instance vars to screen
	 */
	@Override
	public void showAll()	{
		System.out.println("Back");
		super.showAll();
		System.out.println("Max Speed: "+this.maxSpeed);
	}
}
