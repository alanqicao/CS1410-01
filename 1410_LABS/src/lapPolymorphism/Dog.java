package lapPolymorphism;

/**
 * Dog Class includes Dog's Breed and dog behavior.
 * @author CSIS1410 Qi Cao
 *
 */
public class Dog
{
    private final String breed;

    /**
     * Constructor of Dog
     * @param b type string dog breed of Dog
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * the ways dog Constructor. 
     *  Print an dog communicate way in the following format:</br>
     * "bark....."</br>
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * the ways dog move
     *  Print an dog move in the following format:</br>
     * "run....."</br>
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Return the breed of dog
     * @return the dog breed
     */
    public String getBreed()
    {
        return breed;
    }

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": "+ breed ;
	}

  
   

}
