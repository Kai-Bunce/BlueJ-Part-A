/**
 * Model some details of a product sold by a company.
 * 
 * @author Kai Bunce
 * @version 1.0
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void deliver(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

     public void sell(int amount)
    {
        if(amount < quantity) 
        {
            quantity -= amount;
        }
        else 
        {
            System.out.println("Do not have enough items to sell,current quantity " + quantity +
                               " trying to buy: " + amount);
        }
    }
    
    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    public void rename(String newName)
    {
        this.name = newName;
    }
}
