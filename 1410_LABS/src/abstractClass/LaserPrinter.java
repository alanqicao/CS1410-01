/**
 * 
 */
package abstractClass;

/**
 * LaserPrinter are printers that are used  Laser to print.
 * @author Qi Cao
 *
 */
public class LaserPrinter extends Printer {
	
	private int remainingToner;

	/**
	 * Initializes the field model of the superclass Printer and set remaining toner to 100.
	 * @param model
	 */
	public LaserPrinter(String model) {
		super(model);
		
		remainingToner = 100;
	}
	
	/**
	 * Returns the value of field remainingToner.
	 * @return remainingToner
	 */
	public int getRemainingToner(){
		return remainingToner;
	}
	
	/**
	 * Set the remaining toner to 100
	 */
	public void refillToner(){
		remainingToner = 100;
	}
	
	/**
	 *
	 */
	@Override
	public void print() {
		if(remainingToner == 0) {
			System.out.println("The toner is empty.");
		}else {
			remainingToner = remainingToner - 10;
			System.out.println(super.getModel()+"is printing. Remaining toner: "+remainingToner+"%");

		}

	}

}
