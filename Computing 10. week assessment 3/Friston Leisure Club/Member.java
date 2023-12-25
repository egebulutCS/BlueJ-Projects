
/**
 * Write a description of class Member here.
 * 
 * @author (Ege Bulut) 
 * @version (2/12/2016)
 */
public class Member
{
    private String name;
    private String surname;
    private int year;
    private String memberNumber;
    private int[][] fees;
    
    public Member(String aname, String asurname, int ayear, String amemberNumber)
    {
        if ((ayear>=2000)&&(ayear<=2016))
        {
            name=aname;
            surname=asurname;
            year=ayear;
            memberNumber=amemberNumber;
            fees = new int[16][2];
            for(int i=0;i<16;i++)
            {
                fees[i][1]=-1;
            }
        }
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getYear()
    {
        return year;
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }
    
    public int getFeesForYear(int aYear)
    {
        return fees[aYear-2000][1];
    }
    
    public int[][] getFeesList()
    {
        return fees;
    }
    
    public void setFeesForYear(int aYear, int aNumber)
    {
        fees[aYear-2000][1]=aNumber;
    }
    
    public String toString()
    {
        return (name+" "+surname+" has joined at "+year+" and has the membership number "+memberNumber);
    }
}
