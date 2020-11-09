
import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 *
 * @author Kai Bunce
 * @version 1.0
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    // Random number for the quantity of the product
    private Random randomGenerator;

    private static final Product P1 = new Product(101, "Samsung Galaxy S20");
    private static final Product P2 = new Product(102,  "Apple iPhone 12");
    private static final Product P3 = new Product(103,  "Google Pixel 4A");
    private static final Product P4 = new Product(104,  "Google Pixel 5");
    private static final Product P5 = new Product(105,  "Apple iPhone 11");
    private static final Product P6 = new Product(106,  "Apple iPhone 10");
    private static final Product P7 = new Product(107,  "Moto G9 Play");
    private static final Product P8 = new Product(108,  "Moto G9 Plus");
    private static final Product P9 = new Product(109,  "HUAWEI Mate 40 Pro");
    private static final Product P10 = new Product(110,  "HUAWEI Mate Xs");
       
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
    }
   
    /**
     * This method will run all the tests to show the
     * requirements have been met
     */
    public void runDemo()
    {
       demoAddProduct();  // test we can add items to the list (test printing all the list)
       demoRemoveProduct();
       demoRenameProduct();
       demoFindId();
       demoGetMatchingName();
       demoDeliver();
       demoSellProducts();
    }
      
     private void demoAddProduct()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
    }
     
    private void demoRemoveProduct()  
    {
      System.out.println("*** TESTING REMOVING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts(); // should show 1 product
      manager.deleteProduct(P1.getID()); // should remove 1 product
      System.out.println("Products AFTER removing Samsung Galaxy S20");
      manager.printAllProducts(); //Should show 0 products
    }
    
    private void demoRenameProduct()  
    {
      System.out.println("*** TESTING RENAMING PRODUCT ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.renameProduct(P1.getID(),"New Samsung Galaxy S20"); // should rename the product
      manager.printAllProducts();
    }
   
    private void demoFindId()  
    {
      System.out.println("*** TESTING FINDING PRODUCTS ID ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.findProduct(P1.getID());
    }
    
    private void demoGetMatchingName()  
    {
      System.out.println("*** TESTING GETTING NAME PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts(); // should show 1 product
      manager.getMatchingName("New Samsung Galaxy S20");
    }
    
    private void demoDeliver()  
    {
      System.out.println("*** TESTING DELIVERING A PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.delivery(P1.getID(),4);
    }
    
    private void demoSellProducts()  
    {
      System.out.println("*** TESTING SELLING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.sellProduct(P1.getID(),1);
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    
    private void demoDeliverProducts()
    {
        int quantity = 0;
       
         for(int id = 101; id <= 110; id++)
       {
           quantity = randomGenerator.nextInt(8);
           manager.sellProduct(id, quantity);
       }
       
    }
   
       private void demoSellProducts2()
    {
        int quantity = 0;
       
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProduct(id, quantity);
        }
    }
}
