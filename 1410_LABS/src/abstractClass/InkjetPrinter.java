/**
 * 
 */
package abstractClass;

/**
 * InkjetPrinter are printers that are used  Ink to print.
 * @author caose_000
 *
 */
public class InkjetPrinter extends Printer {
			
		private int remainingCartridge;
		
	/**
	 * Initializes the field model of the superclass Printer and set remaining Cartridge to 100.

	 * @param model
	 */
	public InkjetPrinter(String model) {
		super(model);
		remainingCartridge = 100;
	}
	
	/**
	 *  Returns the value of field RemainingCartridge.
	 * @return RemainingCartridge
	 */
	public int getRemainingCartridge(){
		return remainingCartridge;
	}

	/**
	 * Set the remaining Cartridge to 100
	 */
	public void refillCartridge() {
		remainingCartridge = 100;
	}
	
	/**
	 *
	 */
	@Override
	public void print() {
		if(remainingCartridge == 0) {
			System.out.println("The Cartridge is empty.");
		}else {
			remainingCartridge = remainingCartridge - 10;
			
			System.out.println(super.getModel()+"is printing. Remaining Cartridge: "+remainingCartridge+"%");
		}

	}

}
