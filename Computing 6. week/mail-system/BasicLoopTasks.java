
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicLoopTasks
{
    private int[] theList = {2,4,6,3,8,5,1,9,7};

    public void BasicLoopTasks()
    {
        System.out.println(theList[0]+", "+theList[1]);
    }

    public void printList()
    {
        for(int index=0 ;index<theList.length;index ++)
        {
            System.out.println(theList[index]);
        }
    }

    public int getMax()
    {
        int max = theList[0];
        int position = 0;
        for(int index=0 ;index<theList.length;index ++)
        {
            if (theList[index]>max)
            {
                max=theList[index];
                position=index;
            }
        }
        System.out.println(max + " is at position " + position);
        return max;
    }

    public int getMin()
    {
        int min = theList[0];
        int position = 0;
        for(int index = 0;index<theList.length; index ++)
        {
            if (theList[index]<min)
            {
                min=theList[index];
                position=index;
            }
        }
        System.out.println(min + " is at position " + position);
        return min;
    }

    public int getAverage()
    {
        int a = getMin();
        int b = getMax();
        return (a+b)/2;
    }
}
