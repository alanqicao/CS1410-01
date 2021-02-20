/**
 * 
 */
package nuisance;

/**
 * @author caose_000
 *
 */
public class Insect {
	private String species;
	/**
	 * 
	 */
	public Insect(String species) {
		this.species = species;
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": "+species ;
	}
	
	
}
