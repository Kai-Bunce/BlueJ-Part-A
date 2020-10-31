/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102,  "Apple iPhone 12"));
        manager.addProduct(new Product(103,  "Google Pixel 4A"));
        manager.addProduct(new Product(104,  "Google Pixel 5"));
        manager.addProduct(new Product(105,  "Apple iPhone 11"));
        manager.addProduct(new Product(106,  "Apple iPhone 10"));
        manager.addProduct(new Product(107,  "Moto G9 Play"));
        manager.addProduct(new Product(108,  "Moto G9 Plus"));
        manager.addProduct(new Product(109,  "HUAWEI Mate 40 Pro"));
        manager.addProduct(new Product(110,  "HUAWEI Mate Xs"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        manager.printAllProducts();
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
