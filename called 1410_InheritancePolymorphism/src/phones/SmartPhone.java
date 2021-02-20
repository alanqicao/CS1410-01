/**
 * 
 */
package phones;

import java.util.Random;

/**
 * @author caose_000
 *
 */
public class SmartPhone extends Phone {
	
	private int storage;

	/**
	 * @param model
	 * @param dimension
	 */
	public SmartPhone(String model, Dimension dimension,int storage) {
		
		super(model, dimension);
		if(storage<=0) throw new IllegalArgumentException("Storage needs to be assigned a positive value");
		this.storage = storage;
		
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public String call(long number) {
		
		return "Calling " + number+ " by selecting the number";
	}
	
	public String browse() {
		return "Browsing the web";
	}
	
	public String takePicture() {
		Random rnd = new Random();
		
		int rand = rnd.nextInt(2);
		
		String sb= "Taking a horizontal picture";
		String sb2="Taking a vertical picture";
		
		 if(rand == 1) {return sb;}
		 else return sb2;
		 
		 
	}



	@Override
	public String toString() {
		return super.toString()+" "+storage+"GB";
	}
	
	
	

}
