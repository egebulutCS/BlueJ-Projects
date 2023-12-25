
public class Rider
{
    private String myName;

    //constructor
    public Rider(String name)
    {        
        myName = name;
    }

    public void ringTheBell(Bicycle aBike)
    {
        System.out.println(aBike.ringTheBell());
    }

    public void printState(Bicycle aBike)
    {
        aBike.showState();
    }

    public void goFaster(Bicycle aBike)
    {
        aBike.speedUp();
    }

    public void changeGear(Bicycle aBike, int newGear)
    {
        aBike.changeGear(newGear);
    }

    public void applyBrakes(Bicycle aBike)
    {
        aBike.slowDown();
    }
}
