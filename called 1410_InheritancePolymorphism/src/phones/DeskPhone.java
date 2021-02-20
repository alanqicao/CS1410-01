/**
 * 
 */
package phones;

/**
 * @author caose_000
 *
 */
public abstract class DeskPhone extends Phone {
	
	public boolean connected;
	private Voltage voltage;

	/**
	 * @param model
	 * @param dimension
	 */
	 DeskPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension);
		this.voltage = voltage;
	}
	
	public void plugIn() {
		connected = true;
	}
	
	public void unplug(){
		connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	
	
	
	@Override
	public abstract String call(long number);

	@Override
	public String toString() {
		if(connected)
		return super.toString()+" "+voltage+" connected";
		else return super.toString()+" "+voltage+" not connected";
	}

}
