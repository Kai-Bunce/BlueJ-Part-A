

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Kai Bunce
 */
public class TicketMachine
{
    public static final Ticket AYLESBURY = new Ticket("Aylesbury", 220);
    public static final Ticket AMERSHAM = new Ticket("Amersham", 300);
    public static final Ticket HIGH_WYCOMBE = new Ticket("High Wycombe", 330);
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    // variable to store the ticket currently being bought
    private Ticket currentTicket;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
      
        
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    public void insert10p()
    {
        balance = balance + 10;
    }
    
    public void insert20p()
    {
        balance = balance + 20;
    }
    
    public void insert100p()
    {
        balance = balance + 100;
    }
    
    public void insert200p()
    {
        balance = balance + 200;
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if (currentTicket == null)
        {
            System.out.println("You must assign a ticket");
        }
        else
        {
            int price = currentTicket.getPrice();
            if(balance >= price) 
            {
                // Simulate the printing of a ticket.
                System.out.println("##################");
                System.out.println("# The BlueJ Line");
                System.out.println("# Ticket");
                System.out.println("# " + price + " pence.");
                System.out.println("##################");
                System.out.println();
    
                // Update the total collected with the price.
                total = total + price;
                // Reduce the balance by the price.

                balance = balance - price; 

                
                 // do we need to refund anything
                if (balance > 0)
                {
                  // do a refund
                  refundBalance();
                }
    
                // RESET data for the current ticket
                currentTicket = null;
            }
            
            
            else 
            {
                System.out.println("You must insert at least: " +
                                   (price - balance) + " more cents.");
                        
            }
        }
    }

    /*
     * Return the money in the balance.
     * The balance is cleared.
     */
    private int refundBalance()
    {   

        int amountToRefund;
        amountToRefund = balance;
        System.out.println("Refunding balance " + amountToRefund);
        balance = 0;
        return amountToRefund;
    }
    
     public void printAllTickets(){
      System.out.println("Here are the available tickets");

      AYLESBURY.print();         
      AMERSHAM.print();       
      HIGH_WYCOMBE.print();      
    }
    
    public void selectTicket(Ticket ticketToBuy){
      this.currentTicket = ticketToBuy;
    }
}

 

