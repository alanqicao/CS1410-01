package guitar;

public class GuitarApp {

	public static void main(String[] args) {
		Guitar guitar1 = new Guitar(true,6);
		Guitar guitar2 = new Guitar(true,12);
		Guitar guitar3 = new Guitar(true,6);
		
		Guitar[] guitars= {guitar1,guitar2,guitar3};
		
		for(Guitar e: guitars) {
			System.out.println(e.toString());
		}
		System.out.println();
		System.out.println("guitar1 equals guitar2:"+guitar1.equals(guitar2));
		System.out.println("guitar1 equals guitar2:"+guitar1.equals(guitar3));
		System.out.println();
		System.out.println("guitar1 equals guitar2:"+guitar1.compareTo(guitar2));
		System.out.println("guitar1 equals guitar2:"+guitar1.compareTo(guitar3));
		System.out.println();
	}

}
