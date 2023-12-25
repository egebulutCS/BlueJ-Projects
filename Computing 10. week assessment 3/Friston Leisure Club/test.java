
/**
 * Write a description of class test here.
 * 
 * @author (Ege Bulut) 
 * @version (2/12/2016)
 */
public class test
{
    private ClubRecords c1;

    public test()
    {
        c1 = new ClubRecords();
        System.out.println("******************Creating Members******************");
        c1.createMember("ege","bulut",2015);
        c1.createMember("ömer","ölmez",2015);
        c1.createMember("kaan","kaya",1999);
        c1.createMember("ege","benson",2016);
        c1.createMember("bora","bulut",2003);
        System.out.println("******************Print Members******************");
        c1.print();
        System.out.println("******************Year Joined 2015******************");
        c1.yearJoined(2015);
        System.out.println("******************Year Joined 1999******************");
        c1.yearJoined(1999);
        System.out.println("******************Find From Member Number eb2******************");
        c1.findFromMemberNumber("eb2");
        System.out.println("******************Find From Member Number xz1******************");
        c1.findFromMemberNumber("xz1");
        System.out.println("******************Collect Fees eb1, 2015, 50******************");
        c1.collectFees("eb1",2015,50);
        System.out.println("******************Collect Fees eb1, 2015, -50******************");
        c1.collectFees("eb1",2015,-50);
        System.out.println("******************Collect Fees eb3******************");
        c1.collectFees("eb3",2015,50);
        System.out.println("******************Collect Fees 2002******************");
        c1.collectFees("eb1",2002,50);
        System.out.println("******************Collect Fees 2008******************");
        c1.collectFees("bb1",2008,50);
        System.out.println("******************Fee Records eb1******************");
        c1.feeRecords("eb1");
        System.out.println("******************Fee Records eb3******************");
        c1.feeRecords("eb3");
        System.out.println("******************Fee Records bb1******************");
        c1.feeRecords("bb1");
        System.out.println("******************All Fees For Year 2015******************");
        c1.allFeesForYear(2015);
        System.out.println("******************All Fees For Year 1999******************");
        c1.allFeesForYear(1999);
        System.out.println("******************Check All******************");
        c1.checkAll();
        System.out.println("******************Remove Member eb2******************");
        c1.removeMember("eb2");
        System.out.println("******************Remove Member xz1******************");
        c1.removeMember("xz1");
        System.out.println("******************Print All******************");
        c1.print();
    }
}
