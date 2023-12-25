import java.util.ArrayList
;/**
 * Write a description of class MyList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyList
{
    private ArrayList<String> mylist;
    public MyList()
    {
        mylist = new ArrayList<String>();
    }

    public void addToList(String aWord)
    {
        mylist.add(aWord);
    }

    public String getItem(int aNumber)
    {
        if(aNumber<=mylist.size())
        {
            return mylist.get(aNumber);
        }
        return "";
    }
}
