/**
 * 
 */
package phones;

import java.util.Random;

/**
 * @author caose_000
 *
 */
public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RotaryPhone rp = new RotaryPhone("Model 500",new Dimension(143,208,119),Voltage.V110);
		PushButtonPhone pbp = new PushButtonPhone("Cortelco 2500",new Dimension(178,228,127),Voltage.DUAL);
		SmartPhone sPixe = new SmartPhone("Pixel3",new Dimension(145.6,68.2,7.9),128);
		SmartPhone sIphone = new SmartPhone("iPhone8",new Dimension(138.4,67.3,7.3),64);
		
		
		
		
		Phone [] arrayPhone = {rp,pbp,sPixe,sIphone};
		// Print out Various Phone 
		System.out.println("Various Phones:");
		for(Phone e: arrayPhone) {
			
			System.out.println(e.toString());
			// plug in all the desk phone
			if(e instanceof DeskPhone) {((DeskPhone)e).plugIn();}
		}
		//randomly select one of the desk phones and unplug it 
		Random rnd = new Random();
		int rand = rnd.nextInt(2);
		if (rand ==1)rp.unplug(); else pbp.unplug();

		System.out.println();
		
		//Print Array Elements
		System.out.println("ArrayElements:");
		long number = 8019574111L;
		for(Phone e: arrayPhone) {
			System.out.println(e.toString());
			System.out.println(e.call(number));
			if(e instanceof SmartPhone){
				System.out.println(((SmartPhone)e).takePicture());
			}
			System.out.println();
		}
		
		
	}
	


}
