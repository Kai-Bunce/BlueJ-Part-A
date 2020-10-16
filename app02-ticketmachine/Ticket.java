import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author Kai Bunce
 * @version Version 1
 */
public class Ticket
{
    //Train ride destination
    private String destination;
    
    //This is the ticket price in pence
    private int price;
    
    // Date and time the ticket was issued
    private Date timeStamp;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        timeStamp = new Date();
        this.destination = destination;
        this.price = price;
    }

}
