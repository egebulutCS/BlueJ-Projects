/**
 * Simple class for storing
 */

public class Animal
{
    private String name;
    private int numLegs;
    /**
     * Constructor for objects of class Animal
     */
    public Animal(String aName, int aNumber)
    {
        name = aName;
        numLegs = aNumber;
    }
    
    /**
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return number of legs
     */
    public int getLegs()
    {
        return numLegs;
    }

    public String toString()
    {
        return "Name: " + this.name + "-" + "Legs" + this.numLegs;
    }
}
