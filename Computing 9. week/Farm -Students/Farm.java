import java.util.ArrayList;
/**
 * Write a description of class animals here.
 * 
 * @author (Patrick) 
 * @version (Novmber 2016)
 */

public class Farm
{ 
    private ArrayList<String> animals;

    public Farm()
    {
        animals = new ArrayList<String>();
    }

    /**
     * add a new item and return the number of items 
     * now stored
     * @param String aWord
     * @return int number of items
     */
    public int addToList(String aBeast)
    {
        animals.add(aBeast);
        return animals.size();
    }

    /**
     * get an item by its position in the list.
     * Check that it's a valid position, if it's 
     * not then return an error message
     * @param int position in list
     * @return String animal name
     */
    public String getItem(int aNumber)
    {
        if ((aNumber<0)||(aNumber>animals.size()))
        {
            System.out.println("The position given does not exist.");
            return "";
        }
        else
        {
            return animals.get(aNumber);
        }
    }

    /**
     * @return number of items
     */
    public int noOfItems()
    {
        return animals.size();
    }

    /**
     * Remove an item at a given position
     * Check that it's a valid position. Return the 
     * object removed or an error message
     * @param aNumber
     * @return animal or error
     */
    public String removeAtPosition(int aNumber)
    {
        if ((aNumber<0)||(aNumber>animals.size()))
        {
            System.out.println("There is no item in the given position.");
            return "";
        }
        else
        {
            return animals.remove(aNumber);
        }                  
    }

    /**
     * add an item at beginning of the list
     * @param name of animal
     * @return name of first animal in list
     */
    public String addFirst(String aBeast)
    {       
        animals.add(0,aBeast);
        return animals.get(0);        
    }

    /**
     * Find the the position of a given animal in the list.
     * @param aWord
     */
    public int searchForAnimal(String aBeast)
    {
        return animals.indexOf(aBeast);        
    }

    /**
     * Find and print animals whose name begins with a given letter
     * print message if none found.
     * @param String a letter
     * 
     */
    public void itemsBeginWith(String aLetter)
    {
        int i=0;
        int b=0;
        while(i<animals.size())
        {
            String item=animals.get(i);
            if(item.substring(0,1).equals(aLetter))
            {
                System.out.println(item);
                i++;
                b=1;
            }
            else
            {
                i++;
            }
        }
        if(b==0)
        {
            System.out.println("There are no items that start with "+aLetter);
        }
    }

    /**
     * Print the list
     */
    public void printAll()
    {
        //for each loop
        for(String a:animals)
        {
            System.out.println(a);
        }
    }
}
