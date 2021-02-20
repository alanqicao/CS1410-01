package labPolymorphism;

/**
 * Lab Polymorphism MainApp class
 * @author CSIS + Qi Cao
 *
 */
public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:");
        
        Dog [] dogs = {myDog,mySledDog,myCircusDog};
        
        for(Dog a: dogs)
        {
        	System.out.println();
        	actAsDog(a);
        }
        
   
        
        
    }

    private static void actAsDog(Dog d)
    {
    	System.out.println(d.toString());
    	
    	if (d instanceof SledDog) {
    		SledDog isSledDog = (SledDog) d;
    	    isSledDog.pullSled();
    	}
    	
        d.communicate();
        d.move();
        System.out.println();
    }
}
