
/**
 * Write a description of class StringChallenges2 here.
 * 
 * @author (Patrick) 
 * @version (October 2016)
 */
public class StringChallenges2
{

    public StringChallenges2()
    {
        //no constructor code needed since there are no fields
    }

    /**
     * 1
     * Given 2 strings, a and b, return a string of the form short+long+short, 
     * with the shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).

     *comboString("Hello", "hi") → "hiHellohi"
     *comboString("hi", "Hello") → "hiHellohi"
     *comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) 
    {
        if(a.length()>b.length())
        {
            return b+a+b;
        }
        return a+b+a;

    }

    /**
     * 2
     * Given a string of even length, return a string made of the middle two chars, 
     * so the string "string" yields "ri". The string length will be at least 2.

     *middleTwo("string") → "ri"
     *middleTwo("code") → "od"
     *middleTwo("Practice") → "ct"
     */
    public String middleTwo(String str) 
    {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    /**
     * 3
     * Given a string, return true if it ends in "ly".

     *endsLy("oddly") → true
     *endsLy("y") → false
     *endsLy("oddy") → false
     */
    public boolean endsLy(String str) 
    {
        int length = str.length();   
        if (str.length() < 2)
        {
            return false;
        }
        if (str.substring(length - 2, length).equals("ly"))    
        {
            return true;
        }
        else
        {
            return false; 
        }
    }

    /**
     * 4
     * Given a string and an int n, return a string made of the first and last n chars 
     * from the string. The string length will be at least n.

     *nTwice("Hello", 2) → "Helo"
     *nTwice("Chocolate", 3) → "Choate"
     *nTwice("Chocolate", 1) → "Ce"
     */    
    public String nTwice(String str, int n) 
    {
         return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * 5
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
     * including 0. Note: use .equals() to compare 2 strings.

     *hasBad("badxx") → true
     *hasBad("xbadxx") → true
     *hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) 
    {
        if(str.equals("bad"))    
        {
            return true;
        }
        if(str.length() < 4)    
        {
            return false;   
        }
        if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))    
        {
            return true;   
        }
        else 
        {
            return false; 
        }
    }
}
