package cutter;

public class ElectricPruningShears extends PruningShears {
	private boolean power;

	public ElectricPruningShears(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isOn(){
		return power;
	}
	
	public void onOff(){
		power = !power;
	}
	


	@Override
	public String cut() {
		// TODO Auto-generated method stub
		if(isOn())
		return super.cut();
		else
			return "";
	}

	@Override
	public String toString() {
		return super.toString() + "power= "+(power? "on": "off");
	}
	
}
