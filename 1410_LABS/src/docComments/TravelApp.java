
package docComments;

/**
 * @author Qi Cao
 *
 */
public class TravelApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("BMW", "M4", 25);
		Car car2 = new Car("Honha", "Civic", 42);
		System.out.println("Cars: ");
		System.out.printf("%s %s %d mpg%n", car1.getMake(), car1.getModel(), car1.getMpg());
		System.out.printf("%s %s %d mpg%n", car2.getMake(), car2.getModel(), car2.getMpg());

		TripPlanner trip1 = new TripPlanner("SF", "LA", 382, car1);
		TripPlanner trip2 = new TripPlanner("Tampa", "Miami", 280, car2);

		// California Trip
		System.out.println();
		System.out.println("California Trip: ");
		System.out.println(trip1.toString());
		System.out.printf("fuel consumption: %.1f gallons%n", trip1.fuelConsumption());

		// Florida Trip
		System.out.println();
		System.out.println("Florida Trip: ");
		System.out.println(trip2.toString());
		System.out.printf("fuel consumption: %.1f gallons", trip2.fuelConsumption());

	}

}
