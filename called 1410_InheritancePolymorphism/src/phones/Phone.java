/**
 * 
 */
package phones;

/**
 * Super Class Phone 
 * @author Qi Cao
 *
 */
public abstract class Phone {
		private String model;
		private Dimension dimension;
		/**
		 * @param model
		 * @param dimension
		 */
		 Phone(String model, Dimension dimension) {
			this.model = model;
			this.dimension = dimension;
		}
		
		public abstract  String call(long number);

		@Override
		public String toString() {
			return model + " "+dimension.toString();
		}
		
		
}
