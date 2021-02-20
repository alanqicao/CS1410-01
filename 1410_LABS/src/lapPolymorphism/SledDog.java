package lapPolymorphism;

/**
 * SledDog is extends of Dog class plus breed of SledDog and pullSled
 * @author  CSIS1410 Qi Cao
 *
 */
public class SledDog extends Dog
{
    /**
     * Constructor of Sled
     * @param b type String Sled Dog breed of dog
     */
    public SledDog(String b)
    {
        super(b);
    }

    /**
     * Print an pullSled in the following format:</br>
     * "pull....."</br>
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
