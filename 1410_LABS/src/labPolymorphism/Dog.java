package labPolymorphism;

/**
 * Dog Class includes Dog's Breed and dog behavior.
 * @author CSIS + Qi Cao
 *
 */
public class Dog
{
    private final String breed;

    /**
     * Constructor of Dog
     * @param b type String dog breed of Dog
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Print an Dog communicate way </br>
     * 
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Print and Dog move 
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Retrun the breed of dog
     * @return the dog breed
     */
    public String getBreed()
    {
        return breed;
    }

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + breed;
	}
    
    
}
