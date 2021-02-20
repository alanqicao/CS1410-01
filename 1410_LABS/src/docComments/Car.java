
package docComments;

/**
 * Automobile Car information
 * @author Qi Cao
 *
 */
public class Car {

	private String make;
	private String model;
	private int mpg;

	/**
	 * Constructor initialized the Car with specific make, year
	 * and mileage.
	 * @param String make Brand of the car
	 * @param String model model of the car
	 * @param Integer mpg miles per gallon 
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	/**
	 * Returns the make of the car
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Return the model of the car
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Return the miles per gallon of the car
	 * @return the mpg
	 */
	public int getMpg() {
		return mpg;
	}

}
