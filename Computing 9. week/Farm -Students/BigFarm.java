import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class BigFarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigFarm
{
    private ArrayList<Animal> animals;

    public BigFarm()
    {
        animals = new ArrayList<Animal>();
    }

    public int addToList(Animal animal)
    {
        animals.add(animal);
        return animals.size();
    }

    public String getItem(int aNumber)
    {
        if ((aNumber<0)||(aNumber>animals.size()))
        {
            System.out.println("The position given does not exist.");
            return "";
        }
        else
        {
            Animal ani = animals.get(aNumber);
            String anim = ani.getName();
            return anim;
        }
    }

    public int noOfItems()
    {
        return animals.size();
    }
    
    public void removeByName(Animal aBeast)
    {
        for(int i=0;i<animals.size();i++)
        {
            Animal animal = animals.get(i);
            if(animal==aBeast)
            {
                animals.remove(i);
                break;
            }
        }
    }
    
    public String removeAtPosition(int aNumber)
    {
        if ((aNumber<0)||(aNumber>animals.size()))
        {
            System.out.println("There is no item in the given position.");
            return "";
        }
        else
        {   
            Animal ani = animals.get(aNumber);
            String anim = ani.getName();
            animals.remove(aNumber);
            return anim;
        }
    }

    public String addFirst(Animal animal)
    {
        animals.add(0,animal);
        String anim = animal.getName();
        return anim;
    }

    public int searchForObject(Animal aBeast)
    {
        return animals.indexOf(aBeast);
    }
    
    public int searchForAnimal(String aBeast)
    {
        int b=0;
        for(int i=0;i<animals.size();i++)
        {
            Animal animal = animals.get(i);
            String anim = animal.getName();
            if (anim.equals(aBeast))
            {
                b=i;
                break;
            }
        }
        return b;
    }

    public void itemsBeginWith(String aLetter)
    {
        int i=0;
        boolean b=false;
        while (i<animals.size())
        {
            Animal animal = animals.get(i);
            String anim = animal.getName();
            String anima = anim.substring(0,1);
            if((anima.equals(aLetter)||(anima.toUpperCase().equals(aLetter))))
            {
                System.out.println(anim);
                i++;
                b=true;
            }
            else
            {
                i++;
            }
        }
        if(b==false)
        {
            System.out.println("There are no items that start with "+aLetter);
        }
    }
    
    public void printAll()
    {
        for(Animal a:animals)
        {
            String anim = a.getName();
            System.out.println(anim);
        }
    }
    
    public void printToString()
    {
        for(Animal a:animals)
        {
           System.out.println(a.toString()); 
        }
    }
}
