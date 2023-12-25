import java.util.ArrayList;
/**
 * Write a description of class animals here.
 * 
 * @author (Patrick) 
 * @version (Novmber 2016)
 */

public class Farm2
{ 
    private ArrayList<Animal> animals;
    
    public Farm2()
    {
        animals = new ArrayList<Animal>();
    }

    /**
     * add a new item and return the number of items 
     * now stored
     * @param String aWord
     * @return int number of items
     */
    public int addToList(Animal aBeast)
    {
        animals.add(aBeast); 
        return animals.size();
    }

    /**
     * get an item from its position in the list.
     * Check that it's a valid position, if it's 
     * not then return an error message
     * @param int position in list
     * @return String animal name
     */
    public Animal getItem(int aNumber)
    {
        if(aNumber>=0 && aNumber<animals.size()){
            return animals.get(aNumber);
        }
        else{
            return null;
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
    public Animal removeAtPosition(int aNumber)
    {
        if(aNumber>=0 && aNumber<animals.size()){
            return animals.remove(aNumber); 
        }
        else{
            return null;
        }
                   
    }

    /**
     * add an item at beginning of the list
     * @param name of animal
     * @return name of first animal in list
     */
    public Animal addFirst(Animal aBeast)
    {       
        animals.add(0, aBeast);
        return animals.get(0);        
    }

    /**
     * Find the the position of a given animal in the list.
     * @param aWord
     */
    public int searchForAnimal(Animal aBeast)
    {
        return animals.indexOf(aBeast);        
    }
    
    /**
     * Find and print animals whose name begins with a given letter
     * print message if none found.
     * @param String a letter
     */
    public void itemsBeginWith(String aLetter)
    {
       boolean found = false;
        for(Animal animal : animals) {
            if(animal.getName().substring(0,1).equals(aLetter)) {
                System.out.println(animal);
                found = true;
            }
        }
        if(!found){
            System.out.println("None found");
        }
    }
    
    public void removeAnimal(Animal aBeast)
    {
        animals.remove(aBeast);
    }
    /**
     * Print the list
     */
    public void printAll()
    {
        for(Animal animal : animals) {
             System.out.println(animal);           
        } 
    }
    
    
}