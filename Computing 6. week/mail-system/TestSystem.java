
/**
 * Write a description of class TestSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestSystem
{
    private MailServer ms;
    private MailClient mc1;
    private MailClient mc2;
    
    public TestSystem()
    {
        ms = new MailServer();
        mc1 = new MailClient(ms,"a","P4ssw0rd");
        mc2 = new MailClient(ms,"b","p4ssw0rD");
        mc1.sendMailItem("b","hello","P4ssw0rd");
        mc1.sendMailItem("b","yo","password");
        mc1.sendMailItem("b","world","P4ssw0rd");
        mc2.getAllMailFor("p4ssw0rD");
        mc2.getAllMailFor("password");
    }
    
    public void passChange()
    {
        mc1.changePassword("P4ssw0rd");
        mc1.getAllMail("p4ssw0rd");
        mc1.changePassword("p4ssw0rd");
    }
}
