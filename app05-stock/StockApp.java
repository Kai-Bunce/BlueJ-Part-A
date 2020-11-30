import java.util.Scanner;  // Import the Scanner class
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Kai Bunce
 * @version 1.0
 */
public class StockApp
{
    public final int FIRST_ID = 111;
    // Use to get user input
    private InputReader input;
    
    private StockManager manager;
    
    private StockDemo demo;
    
    private int nextID = FIRST_ID;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            choice = choice.toLowerCase();
            
            executeMenuChoice(choice);
            
            if(choice.equals("quit"))
                finished = true;
        }
   }
    
    /**
     * 
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
         if (choice.equals("remove"))
        {
            removeProduct();
        }
        {
         if (choice.equals("sell"))
            sellProduct();
        }    
        {
         if (choice.equals("search"))
            getMatchingName();
        }
        {
            if (choice.equals("restock"))
            restock();
        }   
        {
            if (choice.equals("lowstock"))
            lowStock();
        }
         {
         if (choice.equals("deliver"))
            deliverProduct();
        }
        if(choice.equals("printall"))
        {
            printAllProducts();
        }
   }
   
   public void addProduct()
   {
        System.out.println("Add a new Product");
        System.out.println();
        
        System.out.println("Please enter the name of the product ");
        String name = input.getInput();
        
        boolean isDuplicate = manager.isDuplicateID(nextID);
        
        if(isDuplicate)
        {
            boolean finished = false;
            
            while(!finished)
            {
                nextID++;
                if(!manager.isDuplicateID(nextID))
                {
                    finished = true;
                }
            }
        }
        
        Product product = new Product(nextID, name);
        manager.addProduct(product);
        
        System.out.println("\nAdded " + product + " to the stock\n");
        printAllProducts();
        nextID++;
    }
    
   public void removeProduct()
   {
        System.out.println("Remove an old Product");
        System.out.println();
        
        System.out.println("Please enter the id of the product ");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);
        manager.removeProduct(id);
        
        printAllProducts();
    }
    
   public void sellProduct()
    {
        System.out.println("Sell a Product");
        System.out.println();
        
        System.out.println("What product do you want to buy(please enter the product ID)?");
        String idStr = input.getInput();
        int id = Integer.parseInt(idStr);
        
        System.out.println("How many do you want to buy");
        String quantityStr = input.getInput();
        int quantity = Integer.parseInt(quantityStr);
        
        manager.sellProduct(id,quantity);
        
        System.out.println("Products sold");
   }
    
   public void getMatchingName()
    {
        System.out.println("Search for a Product");
        System.out.println();
        
        System.out.println("Please give a product name");
        String idStr = input.getInput();
        int id = Integer.parseInt(idStr);
        String quantityStr = input.getInput();
        int quantity = Integer.parseInt(quantityStr);
        String productStr = input.getInput();

       
   }
   
   public void deliverProduct()
    {   
        System.out.println("Delivers a Product");
        System.out.println();
        
        System.out.println("What product do you want to deliver(Please enter the ID))?");
        String idStr = input.getInput();
        int id = Integer.parseInt(idStr);

        System.out.println("How many are being delivered?");
        String quantityStr = input.getInput();
        int quantity = Integer.parseInt(quantityStr);
        
        manager.deliverProduct(id,quantity);
        
        System.out.println("Items delivered");
       
   }
   
   public void lowStock()
    {
        System.out.println("Find products low on stock");
        System.out.println();
        
        String idStr = input.getInput();
        int id = Integer.parseInt(idStr);

        System.out.println("These products are low on stock");        
        String quantityStr = input.getInput();
        int quantity = Integer.parseInt(quantityStr);
          
        
   }
    
   public void restock()
    {
        System.out.println("Restock products low on stock");
        System.out.println();
        
        System.out.println("These products stock have been refilled");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);
   }
   
   /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Deliver:    Deliver a quantity of a product");
        System.out.println("    Sell:       Sells a product");
        System.out.println("    GetMatchingName:     Search for a producut");
        System.out.println("    LowStock:   Prints all products low on stock");
        System.out.println("    Restock:    Restock all lowstock products");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
   public void printAllProducts()
   {
       manager.printAllProducts();
   }
   
   /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Kai's Phones ");
        System.out.println("    App05: by Kai Bunce");
        System.out.println("******************************");
    }
}
