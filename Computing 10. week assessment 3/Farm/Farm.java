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
        if(aNumber>=0 && aNumber<animals.size()){
            return animals.get(aNumber);
        }
        else{
            return "Invalid position";
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
        if(aNumber>=0 && aNumber<animals.size()){
            return animals.remove(aNumber); 
        }
        else{
            return "Invalid position";
        }
                   
    }

    /**
     * add an item at beginning of the list
     * @param name of animal
     * @return name of first animal in list
     */
    public String addFirst(String aBeast)
    {       
        animals.add(0, aBeast);
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
       boolean found = false;
        for(String animal : animals) {
            if(animal.substring(0,1).equals(aLetter)) {
                System.out.println(animal);
                found = true;
            }
        }
        if(!found){
            System.out.println("None found");
        }
    }
    /**
     * Print the list
     */
    public void printAll()
    {
        for(String animal : animals) {
             System.out.println(animal);           
        } 
    }
}
