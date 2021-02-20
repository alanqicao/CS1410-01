package lapPolymorphism;

/**
 * CircusDog class is extends Dog class plus breed of Circus Dog and the way of Circus Dog move
 * @author CSIS1410 Qi Cao
 *
 */
public class CircusDog extends Dog
{
    /**
     * Constructor of CircusDog
     * @param b type string breed of Circus Dog
     */
    public CircusDog(String b)
    {
        super(b);
    }

    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
