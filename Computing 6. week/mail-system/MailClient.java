import java.util.Scanner;
/**
 * A class to model a simple email client. The client is run by a
 * particular user, and sends and retrieves mail via a particular server.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MailClient
{
    // The server used for sending and receiving.
    private MailServer server;
    // The user running this client.
    private String user;
    private String password;
    /**
     * Create a mail client run by user and attached to the given server.
     */
    public MailClient(MailServer server, String user, String password)
    {
        if(password.length()>=6)
        {
            int counter = 0;
            for(int i=0;i<password.length();i++)
            {
                char ch = password.charAt(i);
                if(Character.isDigit(ch))
                {
                    counter++;
                }
            }
            if(counter>=2)
            {
                this.server = server;
                this.user = user;
                this.password=password;
            }
            else
            {
                System.out.println("Your password should contain at least 2 digits.");
            }
        }
        else
        {
            System.out.println("Your password has to be more than 6 characters.");
        }
    }

    public void changePassword(String pw)
    {
        if(pw.equals(password))
        {
            Scanner user_input = new Scanner(System.in);
            String npw;
            System.out.println("Enter your new password:");
            npw = user_input.next();
            String npw2;
            System.out.println("Please enter again:");
            npw2 = user_input.next();
            if(npw.length()<6 || npw2.length()<6)
            {
                System.out.println("Your password has to be more than 6 characters.");
            }
            else if(npw.equals(npw2))
            {
                int counter = 0;
                for(int i=0;i<npw.length();i++)
                {
                    char ch = npw.charAt(i);
                    if(Character.isDigit(ch))
                    {
                        counter++;
                    }
                }
                if(counter>=2)
                {
                    System.out.println("Your password has been successfully changed.");
                    password=npw;
                }
                else
                {
                    System.out.println("Your password should at least contian 2 digits.");
                }
            }
            else
            {
                System.out.println("The two passwords you have entered are not the same.");
            }
        }
        else
        {
            System.out.println("Wrong password.");
        }
    }

    /**
     * Return the next mail item (if any) for this user.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * Print the next mail item (if any) for this user to the text 
     * terminal.
     */
    public void printNextMailItem(String pw)
    {
        if(pw.equals(password))
        {
            MailItem item = server.getNextMailItem(user);
            if(item == null) {
                System.out.println("No new mail.");
            }
            item.print();
            server.getNextMailItem(user);
        }
        else
        {
            System.out.println("Wrong password.");
        }
    }

    /**
     * Send the given message to the given recipient via
     * the attached mail server.
     * @param to The intended recipient.
     * @param message The text of the message to be sent.
     */
    public void sendMailItem(String to, String message, String pw)
    {
        if(pw.equals(password))
        {
            MailItem item = new MailItem(user, to, message);
            server.post(item);
        }
        else
        {
            System.out.println("Wrong password.");
        }
    }

    public void getAllMail(String pw)
    {
        if(pw.equals(password))
        {
            int numOfItems = server.howManyMailItems(user);
            if(numOfItems<=0)
            {
                System.out.println("No new mails."); 
            }
            else
            {
                System.out.println("You have "+numOfItems+" new emails!");
                while (numOfItems>0)
                {
                    MailItem item = server.getNextMailItem(user);
                    item.print();
                    numOfItems--;
                }
                System.out.println("No new mails left to read.");
            }
        }
        else
        {
            System.out.println("Wrong password.");
        }
    }

    public void getAllMailFor(String pw)
    {
        if(pw.equals(password))
        {
            int numOfItems = server.howManyMailItems(user);
            if(numOfItems<=0)
            {
                System.out.println("No new mails.");
            }
            else
            {
                System.out.println("You have "+numOfItems+" new emails!");
                for(int i=0;i<numOfItems;i++)
                {
                    MailItem item = server.getNextMailItem(user);
                    item.print();
                }
                System.out.println("No new emails left to read.");
            }
        }
        else
        {
            System.out.println("Wrong password.");
        }
    }

    public void getAllMailClass()
    {
        MailItem item = server.getNextMailItem(user);
        while (item!=null)
        {
            item.print();
            item = server.getNextMailItem(user);
        }
        System.out.println("No new mails left to read.");
    }
}
