/**
 * 
 */
package cutter;

/**
 * @author caose_000
 *
 */
public class CutterApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pliers sideCutter = new Pliers(6,PliersType.SIDE_CUTTER);
			Pliers endNipper = new Pliers(11,PliersType.END_NIPPER);
			Pliers flushCutter = new Pliers(5,PliersType.FLUSH_CUTTER);
			PruningShears pruningShears = new PruningShears(9);
			ElectricPruningShears electricPruning = new ElectricPruningShears(11);
			ElectricPruningShears electricPruning12 = new ElectricPruningShears(12);
			electricPruning.onOff();
			electricPruning12.onOff();
			
			Cutter [] arrayCutters = {sideCutter,endNipper,flushCutter,pruningShears,electricPruning,electricPruning12};
			
			for(Cutter e: arrayCutters) {
				System.out.println(e+":");
				System.out.println("size = " +e.getSize());
//				if(e instanceof ElectricPruningShears){
//					System.out.println("Power: on");
//				}else 
//					System.out.println("Power: off");
				if(e instanceof ElectricPruningShears){
					System.out.println("Power: "+
							(((ElectricPruningShears)e).isOn()? "on" : "off"));
				}
				System.out.println(e.cut());
				System.out.println();
				
			}
	}

}
