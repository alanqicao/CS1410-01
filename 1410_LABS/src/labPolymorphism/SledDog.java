package labPolymorphism;

/**
 * SledDog Class is extends of Dog Class plus breed of SledDog and PullSled
 * @author CSIS + Qi Cao
 *
 */
public class SledDog extends Dog
{
    /**
     * Constructor of SledDog
     * @param b type String Sled dog breed of dog.
     */
    public SledDog(String b)
    {
        super(b);
    }

    /**
     * Print and pullSled of a dog
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
