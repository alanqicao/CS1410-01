/**
 * 
 */
package abstractClass;

/**
 * @author Qi Cao
 *
 */
public class PrinterApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InkjetPrinter canon = new InkjetPrinter("Canon TS202");
		
		LaserPrinter samsung = new LaserPrinter("Samsung Xpress");
		
		Printer [] arrayPrinter = {canon,samsung};
		
		for(Printer e: arrayPrinter) {
			System.out.println(e.toString());
			for(int i = 0; i<11;i++) {
				e.print();
			}
			
			System.out.println();
			if(e instanceof InkjetPrinter) {
				((InkjetPrinter)e).refillCartridge();
			}
			
			if(e instanceof LaserPrinter) {
				((LaserPrinter)e).refillToner();
			}		
		}

		System.out.println("Remaining "+canon.getModel() +" after refilling: "+  ((InkjetPrinter)canon).getRemainingCartridge()+"%");
		System.out.println("Remaining "+samsung.getModel() +" after refilling: "+  ((LaserPrinter)samsung).getRemainingToner()+"%");
	}

}
