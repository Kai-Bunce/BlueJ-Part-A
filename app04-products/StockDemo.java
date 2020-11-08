
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
       
        /*
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
        */
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
 
      public void runDemoRemove()
    {
        demoRemoveProduct(); //test so we can remove items from the list
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoRemoveProducts();
         * manager.printAllProducts();
         * */
    }
     
         private void demoRemoveProduct()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.deleteProduct(101); // should remove 1 product
      System.out.println("Products AFTER removing Samsung Galaxy S20");
    }
    
          public void runDemoRename()
    {
        demoRename(); //test so we can rename items from the list
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoRenameProduct();
         **/
    }
    
             private void demoRenameProduct()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P3);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.renameProduct(103); // should rename the product
      manager.printAllProducts();
    }
    
              public void runDemoFindId()
    {
        demoFindId(); //test so we can find an item using its ID from the list
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoFindProduct();
         **/
    }
    
         private void demoFindId()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.findProduct();
      
    }
    
       public void runDemoSearchTerm()
    {
        demoGetMatchingName(); // test we can find an item in the list by a string in its name
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoGetMatchingName();

         * */
    }
    
             private void demoGetMatchingName()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.getMatchingName();
    }
    
           public void runDemoAddQuantity()
    {
        demoDeliverProducts(); // test we can deliver item in the list by a string in its name
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();

         * */
    }
    
         private void demoDeliver()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product3
      manager.addProduct(P1);
      manager.printAllProducts();
    }
    
         private void demoSell()  
    {
      demoSellProducts(); // test we can sell item in the list by a string in its name
        /*
         * manager.printAllProducts();
         * demoDeliverProducts();
         * manager.printAllProducts();
         * demoSellProducts();
         * manager.printAllProducts();

         * */
    }
    
         private void demoSellProducts()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.sellProduct();
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
}
