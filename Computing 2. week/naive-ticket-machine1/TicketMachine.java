/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2002.02.06
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        if (ticketCost >0) 
        {
            price = ticketCost;
            balance = 0;
            total = 0;
        }
        else 
        {
            price = 200;
            System.out.println("The price is " + price);
        }

    }

    public TicketMachine()
    {
        price = 100;
        balance = 0;
        total = 0;
        price = 100;
        System.out.println("The price is " + price);
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /** get the total*/

    public int getTotal()
    {
        return total;
    }

    /**
     * Receive an amount of money in cents from a customer.
     * is void because it is a METHOD that does not return anything
     */
    public void insertMoney(int amount)
    {
        balance += amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if (balance>=price)
        {
         
        
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + price;
        // Clear the balance.
        balance = balance - price;
        if(balance>0){
            System.out.println("\nTake your change" + refundBalance() + "pence");
        }
    }
    else
    {
          System.out.println("You need to put in more money!");
    }
        
        }    
    
    public void empty()
    {
        total =0;
    }
    
    public int refundBalance()
    {
      int amountToRefund;
      amountToRefund = balance;
      balance = 0;
      return amountToRefund;
    }
}
