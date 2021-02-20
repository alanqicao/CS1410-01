package docComments;

public class Television {
	
	private String dimension;
	private String name;	
	private boolean smart;
	private int id;
	private static int count = 0;
	/**
	 * @param dimension
	 * @param resolution
	 * @param smart
	 * @param id
	 */
	public Television(String dimension, String name, boolean smart) {
		this.dimension = dimension;
		this.name = name;
		this.smart = smart;
		id =1234567+count++ ;
	}
	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}
	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return name;
	}
	/**
	 * @return the smart
	 */
	public boolean isSmart() {
		return smart;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Television [Dimension=" + dimension + ", Brand=" + name + ", smartTV? =" + smart + ", ID=" + id
				+ "]";
	}
	
	
	
	
	
	
}
