/**
 * 
 */
package phones;

/**
 * @author Qi Cao
 *
 */
public class PushButtonPhone extends DeskPhone {

	/**
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String call(long number) {
		// TODO Auto-generated method stub
		return "Pushing buttons to call "+number;
	}

}
