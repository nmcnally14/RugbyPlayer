/**
 * 
 */
package p2Monday40008228;

/**
 * This class is for the rugby player
 * @author Nicola
 *
 */
public class RugbyPlayer {
	
	private String name;
	private int age;
	private double  weight;
	private String nationality;
	
	/**
	 * Default constructor
	 */
	public RugbyPlayer() {
		
	}
	
	/**
	 * constructor with args
	 * @param name
	 * @param age
	 * @param weight
	 * @param nationality
	 */
	public RugbyPlayer(String name, int age, double weight, String nationality) {
		this.name = name;
		// change this as age is set between 16 and 40
		this.setAge(age);
		this.weight = weight;
		this.nationality = nationality;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RugbyPlayer [name=" + name + ", age=" + age + ", weight=" + weight + ", nationality=" + nationality
				+ "]";
	}

	/**
	 * get the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * sets the age - should be between 16 and 40
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age>=16 && age <=40)	{
			this.age = age;
		} else	{
			System.out.println("Invalid Age");
			this.age = -1;
		}
		
	}

	/**
	 * this gets the weight
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * this sets the weight
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * this gets the nationality
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * This sets the nationality
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * Displays all instance vars to screen
	 */
	public void showAll()	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Weight : "+this.weight);
		System.out.println("Nationality : "+this.nationality);
	}


	

}
