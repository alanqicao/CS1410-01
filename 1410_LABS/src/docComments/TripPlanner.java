
package docComments;

/**
 * TripPlanner information includes departure, arrival, and distance
 * @author Qi Cao
 *
 */
public class TripPlanner {

	private String departure;
	private String arrival;
	private int distance;
	private Car car;

	/**
	 * Constructor of class TripPlanner 
	 * @param String departure departure location of the trip.
	 * @param String arrival  arrival location of the trip
	 * @param Integer distance distance between the trip
	 * @param Object car
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;

	}
	
/**
 * Calculate the cost of the fuel for the trip
 * @return amountOfFuel return in double the cost of fuel
 */
	public double fuelConsumption() {

		double amountOfFuel = (double) this.distance / (double) car.getMpg();

		return amountOfFuel;

	}

	@Override
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car= "
				+ car.getModel() + "]";
	}

}
