package abstractClass;

/**
 * Printer represents a printer that can print
 * Different printer have different way of printing.
 * @author Qi Cao
 *
 */
public abstract class Printer {
	private String model;
	private static int count;
	private int serialNumber;
	/**
	 * Initialized the field model and SerialNumber
	 * @param model
	 * @param serialNumber
	 */
	protected Printer(String model) {
		this.model = model;
		count = count + 1;
		serialNumber = 12345+count;
	}
	
	/**
	 * Returns the value of field model
	 * @return the model
	 */
	public String getModel(){
		return model;
	}
	
	/**
	 * Returns the value of field serialNumber
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		
		return serialNumber;
	}
	
	/**
	 * Return a string that describes remaining Toner or Cartridge
	 * 
	 */
	public abstract void print();
	
	
	

	/**
	 *Return a string of the following format:
	 *{name of the class} Model = {model} "# "SerialNumber = {serialNumber}
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": "+model+" #"+serialNumber;
	}
	
	
}
