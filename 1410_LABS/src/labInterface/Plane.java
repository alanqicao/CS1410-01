package labInterface;

/**
 * @author Qi Cao
 *
 */
public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;

	/**
	 * @param engines
	 * @param m
	 */
	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}

	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	@Override
	public void launch() {
		System.out.println("Rolling until take-off");
		
	}

	@Override
	public void land() {
		System.out.println("Rolling to a stop");
		
	}
}
