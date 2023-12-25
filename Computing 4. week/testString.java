
/**
 * Write a description of class testString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testString
{
    private String name;

    public String stringing()
    {
        name = "abcdef";
        String owen = "";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(owen = name.substring(1));
        System.out.println(name.substring(2,5));
        System.out.println("---------------");
        return "";
    }

    public void helloName(String name)
    {
        System.out.println("Hello " +name);
    }

    public void makeOutWord(String aWord)
    {
        String out = "<<<>>>";
        System.out.println(out.substring(0,3)+aWord+out.substring(3));
    }

    public void firstHalf(String bWord)
    {
        int l = bWord.length();
        System.out.println(bWord.substring(0,l/2));
    }

    public void nonStart(String fWord, String nWord)
    {
        System.out.println(fWord.substring(1)+nWord.substring(1));
    }

    public void creditCard(String Card)
    {
        String sansür = " **** **** ";
        System.out.println(Card.substring(0,4)+sansür+Card.substring(12));
    }

    public void makeTags(String tag, String word) 
    {
        System.out.print("<"+tag+">" + word + "</"+tag+">");
    }

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

    public String nTwice(String str, int n) 
    {   
        return str.substring(0, n) + str.substring(str.length() - n); 
    }

    public String twoChar(String str, int index) {
        if(index>str.length()-2)
        {
            return str.substring(0,2);
        }
        if(index<0)
        {
            return str.substring(0,2);
        }
        else
        {
            return str.substring(index,index+2);
        }

    }

    public String middleThree(String str) {
        int l = str.length();
        int halfp1 = l+1;
        int halfm1 = l-1;
        int halfp3 = l+3;
        int second = halfp1/2;
        int fourth = halfm1/2;
        int third = halfp3/2;
        String a = str.substring(second-1,second);
        String b = str.substring(third-1,third);
        String c = str.substring(fourth-1,fourth);
        return c+a+b;
    }

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

    public String atFirst(String str) {
        if(str.length()>=2)
        {
            return (str.substring(0,2));
        }
        if(str.length()==1)
        {
            return str+"@";
        }
        else
        {
            return "@@";
        }
    }

    public String lastChars(String a, String b) {
        if(a.length()==0 && b.length()==0)
        {
            return "@@";
        }
        if(a.length()==0)
        {
            return "@"+b.substring(b.length()-1,b.length()); 
        }
        if(b.length()==0)
        {
            return a.substring(0,1)+"@";
        }
        else
        {
            return (a.substring(0,1)+b.substring(b.length()-1,b.length()));
        }
    }

    public String conCat(String a, String b) 
    {   
        if(a == "")    
        {
            return b;
        }
        if(b == "")    
        {
            return a;
        }
        if(a.substring(a.length()-1).equals(b.substring(0,1)))    
        {
            return a + b.substring(1);   
        }
        else
        {
            return a + b; 
        }
    }

    public String lastTwo(String str) 
    {
        if(str.length()>=2)
        {
            return (str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1));
        }
        else
        {
            return str;
        }
    }

    public String seeColor(String str) 
    {
        if(str.length()>2)
        {
            if(str.substring(0,3).equals("red"))
            {
                return "red";
            }
            else if(str.length()>3)
            {
                if(str.substring(0,4).equals("blue"))
                {
                    return "blue";
                }
            }
        }
        else
        {
            return "";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) 
        {
            return false;
        }
        String front = str.substring(0, 2);
        String back = str.substring(str.length()-2);
        return(front.equals(back));
    }

    public String minCat(String a, String b) {
        int l = a.length();
        int k = b.length();
        if(l>k)
        {
            return a.substring(l-k)+b;
        }
        if(k>l)
        {
            return a+b.substring(k-l);
        }
        return "";
    }

    public String extraFront(String str) {
        if(str.length()<=2)
        {
            return str+str+str;
        }
        else
        {
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
    }

    public String without2(String str) 
    {
        if(str.length()<2)
        {
            return str;
        }
        if(str.substring(0,2).equals(str.substring(str.length()-2)))
        {
            return str.substring(2);
        }
        else
        {
            return str;
        }
    }

    public String deFront(String str) 
    {      
        if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b") )    
        {
            return str;
        }
        else if (str.substring(0,1).equals("a"))    
        {
            return "a" + str.substring(2);
        }
        else if (str.substring(1,2).equals("b"))    
        {return str.substring(1);
        }
        else 
        {return str.substring(2);
        }
    }

    public String withoutX(String str) {
        if(str.equals(""))
        {
            return "";
        }
        if(str.substring(0,1).equals("x")&&str.substring(str.length()-1).equals("x")&&str.length()>1)
        {
            return str.substring(1,str.length()-1);
        }
        else if(str.substring(0,1).equals("x"))
        {
            return str.substring(1);
        }
        else if(str.substring(str.length()-1).equals("x"))
        {
            return str.substring(0,str.length()-1);
        }
        else
        {
            return str;
        }
    }
}
