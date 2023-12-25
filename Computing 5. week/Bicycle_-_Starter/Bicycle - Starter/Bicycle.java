
/**
 * Write a description of class Bicycle here.
 * @author Patrick
 * @version 2
 */
public class Bicycle {

    private int speed;
    private int gear;
    private String bikeType;
    private int incSpeed;

    public Bicycle()
    {
        speed =0;
        gear = 1;
        incSpeed = 3;
        bikeType = "mountain";           
    }

    public Bicycle(int aSpeed, int aGear, int inc, String aType)
    {
        speed = aSpeed;
        gear = aGear;
        inc = incSpeed;
        bikeType = aType;
    }  

    public int getSpeed()
    {
        return speed;
    }

    public int getGear()
    {
        return gear;
    }

    public String getBikeType()
    {
        return bikeType;
    }

    public void changeGear(int newValue) 
    {
        if(newValue<4&&newValue>=1)
        {
            gear = newValue;
        }

    }

    public void speedUp() 
    {
        speed++;
    }

    public void slowDown() 
    {     
        if(speed>0)
        {
            speed--;
        }

    }

    public String ringTheBell() 
    {
        return "Ring Ring";
    }

    public void showState() {
        System.out.println(" Speed: "+ speed + " Gear: "+ gear + " Type: " + bikeType);
    }

    public String toString()
    {
        return ("Hello World");
    }
}
