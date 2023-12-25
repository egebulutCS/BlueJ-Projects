
/**
 * Write a description of class Heater here.
 * 
 * @author (Ege Bulut) 
 * @version (26.06.2016)
 */
public class Heater
{
    private int temperature;
    private int increment;
    private int min;
    private int max;
   
    public Heater(int aTemperature, int anIncrement)
    {
        temperature = aTemperature;
        increment = anIncrement;
        max = temperature + 3* increment;
        min = temperature - 3* increment;
    }
      
    public Heater()
    {
        temperature = 30;
        increment = 5;
        max = temperature + 3* increment;
        min = temperature - 3* increment;
    }
    
    public void makeWarmer()
    {
        int addition = temperature + increment;
        
        if (addition <= max)
        {
            temperature += increment;
        }
        else
        {
            System.out.println("Current temperature is set to " +temperature+ " degrees. Setting back to initial temperature...");
            temperature =30;
        }
    }
    
    public void makeCooler()
    {
        int substraction = temperature - increment;
        
        if (substraction >= min)
        {
            temperature -= increment;
        }
        else
        {
            System.out.println("Current temperature is set to " +temperature+ " degrees. Setting back to initial temperature...");
            temperature =30;
        }
    }
    
    public int getTemperature()
    {
        return temperature;
    }
    
    public void setMinMax(int amax, int amin)
    {
        if (amax>amin && amax>temperature && amin<temperature)
        {
            max=amax;
            min=amin;
            System.out.println("The maximum value for the heater is set to " +amax+ " degrees.");
            System.out.println("The minimum value for the heater is set to " +amin+ " degrees.");
        } 
        else
        {
            System.out.println("Invalid values. No change has been made.");
        }
    }
 
    public void showState()
    {
        System.out.println("The current temperature is " +temperature+ " degrees.");
        System.out.println("Increment value is " +increment+ " degrees.");
        System.out.println("Maximum temperature limit is " +max+ " degrees.");
        System.out.println("Minimum temperature limit is " +min+ " degrees.");
    }
    
    public void ResetHeater()
    {
        temperature = 30;
        increment = 5;
        max = temperature + 3* increment;
        min = temperature - 3* increment;
        showState();
    }
}
