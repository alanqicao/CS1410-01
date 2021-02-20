/**
 * 
 */
package phones;

/**
 * @author caose_000
 *
 */
public class RotaryPhone extends DeskPhone {

	/**
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String call(long number) {
		
		return "Rotating the dial to call " +number;
	}
	
}
