import java.util.ArrayList;
/**
 * Write a description of class ClubRecords here.
 * 
 * @author (Ege Bulut) 
 * @version (2/12/2016)
 */
public class ClubRecords
{
    private ArrayList<Member> members;

    public ClubRecords()
    {
        members = new ArrayList<Member>();
    }

    public void createMember(String name, String surname, int year)
    {
        if ((year>=2000)&&(year<=2016))
        {
            int counter=1;
            for (int i=0;i<members.size();i++)
            {
                String aName = members.get(i).getName();
                String aSurname = members.get(i).getSurname();
                if (name.substring(0,1).equals(aName.substring(0,1))&&(surname.substring(0,1).equals(aSurname.substring(0,1))))
                {
                    counter++;
                }
            }
            String memberNumber = (name.substring(0,1)+surname.substring(0,1)+counter);
            Member aMember = new Member(name,surname,year,memberNumber);
            members.add(aMember);
        }
        else
        {
            System.out.println("Membership is available from years 2000 to 2016 only.");
        }
    }

    public Member yearJoined(int aYear)
    {
        if((aYear>=2000)&&(aYear<=2016))
        {
            for(int i=0;i<members.size();i++)
            {
                Member m = members.get(i);
                int year = m.getYear();
                if (year==aYear)
                {
                    System.out.println(m.toString());
                }
            }
        }
        else
        {
            System.out.println("Membership is available from years 2000 to 2016 only.");
        }
        return null;
    }

    public Member findFromMemberNumber(String aMemberNo)
    {
        boolean b=false;
        for(Member m:members)
        {
            String memberNo = m.getMemberNumber();
            if(memberNo.equals(aMemberNo))
            {
                System.out.println(m.toString());
                b=true;
            }
        }
        if(b==false)
        {
            System.out.println("No member with "+aMemberNo+" membership number was found.");
        }
        return null;
    }

    public void collectFees(String aMemberNo, int aYear, int feePrice)
    {
        if(feePrice>=0)
        {
            boolean b=false;
            for(Member m:members)
            {
                String memberNo = m.getMemberNumber();
                if(memberNo.equals(aMemberNo))
                {
                    int year = m.getYear();
                    if((aYear<year)||(year>2016))
                    {
                        System.out.println(aMemberNo+" has no record at year "+aYear);
                    }
                    else
                    {
                        int fee = m.getFeesForYear(aYear);
                        if(fee==-1)
                        {
                            m.setFeesForYear(aYear,feePrice);
                            System.out.println("Your membership for "+aYear+" year is now enabled for "+feePrice+" pounds "+aMemberNo);
                            b=true;
                        }
                        else
                        {
                            System.out.println("You have already paid "+fee+" pounds for the year "+aYear);
                        }
                    }
                    b=true;
                }
            }
            if(b==false)
            {
                System.out.println("No member with "+aMemberNo+" membership number was found.");
            }
        }
        else
        {
            System.out.println("Fee value should be a positive value.");
        }
    }

    public void feeRecords(String aMemberNo)
    {
        boolean b=false;
        boolean c=false;
        for(Member m:members)
        {
            String memberNo = m.getMemberNumber();
            if(memberNo.equals(aMemberNo))
            {
                int year = m.getYear();
                String string = memberNo+" haven't paid the fee for year";
                String bString = memberNo+" have paid the fee for year";
                String sYear = "";
                String bYear = "";
                while(year<2016)
                {
                    int fee = m.getFeesForYear(year);
                    if(fee==-1)
                    {
                        sYear=Integer.toString(year);
                        string=string+", "+sYear;
                    }
                    else
                    {
                        bYear=Integer.toString(year);
                        bString=bString+", "+bYear;
                    }
                    year++;
                }
                if(!sYear.equals(""))
                {
                    System.out.println(string);
                }
                else
                {
                    c=true;
                }
                if(!bYear.equals(""))
                {
                    System.out.println(bString);
                }
                b=true;
            }
        }
        if(b==false)
        {
            System.out.println("No member with "+aMemberNo+" membership number was found.");
        }
        if(c==true)
        {
            System.out.println(aMemberNo+" have paid all fees from the year membership has started.");
        }
    }

    public void allFeesForYear(int aYear)
    {
        if((aYear>=2000)&&(aYear<=2016))
        {
            for(Member m:members)
            {
                int fee = m.getFeesForYear(aYear);
                String name = m.getMemberNumber();
                if(fee==-1)
                {
                    System.out.println(name+" haven't paid any fees for the year "+aYear);
                }
                else
                {
                    System.out.println(name+" have paid "+fee+" pounds for the year "+aYear);
                }
            }
        }
        else
        {
            System.out.println("Membership is available from years 2000 to 2016 only.");
        }
    }

    public void checkAll()
    {
        for(Member m:members)
        {
            int year = m.getYear();
            String memberNo = m.getMemberNumber();
            String string = memberNo+" haven't paid the fee for year";
            String sYear = "";
            while(year<2016)
            {
                int fee = m.getFeesForYear(year);
                if(fee==-1)
                {
                    sYear=Integer.toString(year);
                    string=string+", "+sYear;
                }
                year++;
            }
            if(!sYear.equals(""))
            {
                System.out.println(string);
            }
        }
    }

    public void removeMember(String aMemberNo)
    {
        boolean b=false;
        for(Member m:members)
        {
            String memberNo = m.getMemberNumber();
            if(memberNo.equals(aMemberNo))
            {
                int index = members.indexOf(m);
                System.out.println(m.toString()+", found and removed.");
                members.remove(index);
                b=true;
            }
        }
        if(b==false)
        {
            System.out.println("No member with "+aMemberNo+" membership number was found.");
        }
    }

    public void print()
    {
        for(Member m:members)
        {
            System.out.println(m.toString());
        }
    }
}
