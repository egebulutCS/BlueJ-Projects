
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private Heater ht1;
    private Heater ht2;

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        // initialise instance variables
        ht1 = new Heater();
        ht1.showState();
        ht1.makeWarmer();
        ht1.showState();
        ht1.makeWarmer();
        ht1.showState();
        ht1.makeWarmer();
        ht1.showState();
        ht1.makeWarmer();
        ht1.showState();
        ht1.setMinMax(20,30);
        ht1.showState();
        ht1.makeCooler();
        ht1.showState();
        ht1.makeCooler();
        ht1.showState();
        ht1.makeCooler();
        ht1.showState();
        ht1.makeCooler();
        ht1.showState();
    }
}
