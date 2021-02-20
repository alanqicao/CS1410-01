package nuisance;

public class Mosquito extends Insect implements Nuisance{

	public Mosquito(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}
	
	public String buzz() {
		
		return super.getSpecies()+ " buzzing around";
	}

	@Override
	public String annoy() {
		// TODO Auto-generated method stub
		return "buzz buzz buzz";
	}

}
