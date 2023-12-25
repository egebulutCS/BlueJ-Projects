
/**
 * Write a description of class TestBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBook
{
   private Book bk;
   
    public TestBook()
    {
        bk = new Book("Kennedy","Summertime",100);
        bk.showDetails();
        bk.setRefNumber("C1F568GH");
        bk.showDetails();
        bk.setRefNumber("C1F");
        bk.showDetails();
        bk.borrow();
        bk.showDetails();
        System.out.println(bk);
    }

   
}
