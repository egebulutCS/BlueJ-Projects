/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author ()
 * @version (1)
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * constructor 1
     */
    public Book(String bookAuthor, String bookTitle, int apages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = apages;
        refNumber = "";
        borrowed = 0;
    }

    /**
     * constructor 2
     */
    public Book()
    {
        author = "Smith";
        title = "My Life";
        pages = 100;
        refNumber = "";
        borrowed = 0;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int borrowed()
    {
        return borrowed;
    }
    
    public void showDetails()
    {
        System.out.println("The author of the book is " +author+ ", with the title " +title+ ", and it has " +pages+ " pages. This book has been borrowed " +borrowed+ " times.");
        if (refNumber != "")
        {
            System.out.println("The reference number is " +refNumber);
        }
        else
        {
            System.out.println("No Ref");
        }
    }

    public void setRefNumber(String _refNumber)
    {
        int length = _refNumber.length();
        if (length != 3)
        {
            System.out.println("Reference number can only contain 3 digits!");
        }
        else
        {
            refNumber = _refNumber;
        }
    }

    public void printRef()
    {
        System.out.println("The reference number is " +refNumber);
    }
    //mutator method
    public void borrow()
    {
        borrowed += 1;
    }       

    
    
    
    
    
    
    public String toString()
    {
        return ("hello world." + "\ndon't buy this book.");
    
    
    
    
    }
}
