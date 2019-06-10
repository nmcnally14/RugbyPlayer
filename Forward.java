/**
 * 
 */
package p2Monday40008228;

/**
 * @author Nicola
 * This is the Forward class
 *
 */
public class Forward extends RugbyPlayer {
	
	private int maxBench;

	/**
	 * Default constructor
	 */
	public Forward() {
		
	}

	/**
	 * Constructor with args
	 * @param name
	 * @param age
	 * @param weight
	 * @param nationality
	 */
	public Forward(String name, int age, double weight, String nationality, int maxBench) {
		super(name, age, weight, nationality);
		this.maxBench = maxBench;
		
	}

	/**
	 * This gets max bench
	 * @return the maxBench
	 */
	public int getMaxBench() {
		return maxBench;
	}

	/**
	 * This sets the max bench
	 * @param maxBench the maxBench to set
	 */
	public void setMaxBench(int maxBench) {
		this.maxBench = maxBench;
	}

	/**
	 * constructor using fields
	 * @param maxBench
	 */
	public Forward(int maxBench) {
		super();
		this.maxBench = maxBench;
	}
	
	/**
	 * Displays all instance vars to screen
	 */
	@Override
	public void showAll()	{
		System.out.println("Forward");
		super.showAll();
		System.out.println("Max Bench : "+this.maxBench);
	}
	
	
	

}
