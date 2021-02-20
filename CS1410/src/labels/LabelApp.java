package labels;

public class LabelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("137 James St", "Kent", State.WA, 98032);
		System.out.println("address1: "+ address1.getStreet()+" "+address1.getCity()
		+" "+address1.getStreet()+" " +address1.getZip() );
		Address address2 = new Address("137 James St", "Kent", State.WA, 98032);
		System.out.println("address2: "+ address2);
		System.out.println();
		AddressLabel addressLabel = new AddressLabel("Dan", "Smith", address1);
		System.out.println("addressLabel: "+addressLabel);
		System.out.println();
		addressLabel.printLabel();

	}

}
