package cutter;

public abstract class Cutter {
	private int size;

	/**
	 * @param size
	 */
	public Cutter(int size) {
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * 
	 * @return
	 */
	public abstract String cut();

	/**
	 *Returns a string of the following format;
	 *{name of the class} size ={size}
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" [size=" + size + "]";
	}
	
	
}
