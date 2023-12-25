
/**
 * Write a description of class BossyRider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OwnerRider
{
    private Bicycle myBike; 
    private String myName;

    public OwnerRider(String aName)
    {
        myName = aName;
        myBike = new Bicycle();
    }

    public void ringBell()
    {
        System.out.println(myBike.ringTheBell());
    }

    public void printBicycleState()
    {
        myBike.showState();
    }

    public void changeGear(int newGear)
    {
        myBike.changeGear(newGear);
    }
}
