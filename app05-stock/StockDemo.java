
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
        
        manager.addProduct(P1);
        manager.addProduct(P2);
        manager.addProduct(P3);
        manager.addProduct(P4);
        manager.addProduct(P5);
        manager.addProduct(P6);
        manager.addProduct(P7);
        manager.addProduct(P8);
        manager.addProduct(P9);
        manager.addProduct(P10);
    }
   
    /**
     * This method will run all the tests to show the
     * requirements have been met
     */
    public void runDemo()
    {
       demoAddProduct();  // test we can add items to the list (test printing all the list)
       demoRemoveProduct(); // this will delete the product in the list, the list now has 0 items
       demoRenameProduct(); // this will add a product to the list and rename it,  the list now has 1 items
       demoLowStock(); // this test finds a product which is low on stock
       demoFindId(); // this test does not add any products to the list, the "findProduct" method will search through all the list of products
       demoGetMatchingName(); // this test does not add any products to the list, the "getMatchingName" method will search through all the list of products
       demoDeliver();  // this test does not add any products to the list, its using the product added in the rename test 
       demoSellProducts(); // this test does not add any products to the list, its using the product added in the rename test 
       demoAddProductWhenTheresAlreadyOne(); // this test attempts to add a product which is already listed
       demoSellProductsWhensStocksTooLow(); // this test is to sell a product when there isn't enough stock
       demoRemoveProductWhichDoesNotExist(); // this test is to remove a product that doesn't exist
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
   
    private void demoLowStock()
    {
      System.out.println("*** TESTING LOW STOCK ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.addProduct(P2); 
      manager.addProduct(P3);
      manager.addProduct(P4);  
      manager.addProduct(P5);  
      manager.addProduct(P6);  
      manager.addProduct(P7);  
      manager.printAllProducts();  // should show 7 products
      manager.deliverProduct(P1.getID(),4);
      manager.deliverProduct(P2.getID(),2);
      manager.deliverProduct(P3.getID(),1);
      manager.deliverProduct(P4.getID(),1);
      manager.deliverProduct(P5.getID(),2);
      manager.deliverProduct(P6.getID(),5);
      manager.deliverProduct(P7.getID(),3);
      manager.getLowStock();
    }
    
    private void demoFindId()  
    {
      System.out.println("*** TESTING FINDING PRODUCTS ID ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      Product foundProduct = manager.findProduct(P1.getID());
      System.out.println("Found Product : " + P1.toString());  
    }
    
    private void demoGetMatchingName()  
    {
      System.out.println("*** TESTING FINDING PRODUCTS NAME ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      Product foundProduct = manager.findProduct(P1.getID());
      System.out.println("Found Product : " + P1.toString());  
    }
    
    private void demoDeliver()  
    {
      System.out.println("*** TESTING DELIVERING A PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.deliverProduct(P1.getID(),4);
      System.out.println(P1.toString());  
    }
    
    private void demoSellProducts()  
    {
      System.out.println("*** TESTING SELLING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.sellProduct(P1.getID(),1);
      System.out.println(P1.toString());  
    }
    
     private void demoAddProductWhenTheresAlreadyOne()  
    {
      System.out.println("*** TESTING ADDING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 0 product
      manager.addProduct(P1);
      System.out.println("Products AFTER adding Samsung Galaxy S20");
      manager.printAllProducts();  // should show 1 product
      manager.addProduct(P1);
      System.out.println("Product is already added");
    }
    
        private void demoSellProductsWhensStocksTooLow()  
    {
      System.out.println("*** TESTING SELLING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts();  // should show 1 product
      manager.sellProduct(P1.getID(),10);
      System.out.println(P1.toString());  
    }
    
        private void demoRemoveProductWhichDoesNotExist()  
    {
      System.out.println("*** TESTING REMOVING PRODUCTS ***");
      System.out.println("Products BEFORE");
      manager.printAllProducts(); // should show all products
      manager.deleteProduct(P10.getID()); // should remove 1 product that does not exist
      System.out.println("Product does not exist");
      manager.printAllProducts(); //Should show 0 products
    }
}
