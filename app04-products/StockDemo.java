import java.util.Random;

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
    
    private Random randomGenerator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        
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
     * This method will run all the tests to show the
     * requirements have been met
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProducts()
    {
        int quantity = 0;
        
         for(int id = 101; id <= 110; id++)
       {
           quantity = randomGenerator.nextInt(8);
           manager.sellProduct(id, quantity);
       }
       
    }
    
       private void demoSellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProduct(id, quantity);
        }
    }
    
    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
