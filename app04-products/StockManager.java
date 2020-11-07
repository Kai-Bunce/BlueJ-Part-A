import java.util.ArrayList;

/**
 * Manage the stock of phones in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Kai Bunce 
 * @version 1.0
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private String newProductName;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Increases the quantity by delivering a product
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.deliver(amount);
            System.out.println("Product Delivered : " + product);  
        }
        else
        {
            System.out.println("Product ID " + id + " does not exist");
        }
    }
    
     /**
     * Sells a product
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            if(quantity > product.getQuantity())
               quantity = product.getQuantity();
            printProduct(id);
            for(int count = 0; count <= quantity; count++)
            {
               product.sellOne(); 
            }
            printProduct(id);
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     */
    public Product findProduct(int id)
    {
     
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }    
        }
        return null;
    }
    
    /**
     *Shows the stock the ID has
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details on the given product
     * If found the name and stock level will be displayed
     * @param id The ID of the product to look for
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print products with stock less than or equal to 2
     */
    public ArrayList<Product> getLowStock()
    {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : stock)
        {
            if(product.getQuantity() <=2)
            {
                System.out.println("These products stocks are low " + product);
            }
        }
        return result;
    }
        
    /**
     * Renaming a product using its ID
     */
    public void renameProduct(int id,String newName)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            String previousname = product.getName();
            product.renameProduct(newName);
            
            if(previousName != product.getName())
            {
                System.out.println("The product has been renamed "+ previousname
                + "to " + product.getName());
            }
        }
    }
    
    /**
     * A product can be deleted by ID
     */
    public void deleteProduct(int id)
    {
        Product product = findProduct(id);
        {
            if(product != null)
            {
                this.stock.remove(product);
                System.out.print("The product is no longer sold " + product);
            }
        }
    }
    
    
    
    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Kai's Phones");
        System.out.println("=============");
        System.out.println();
        
        for(Product product :stock)
        {
            System.out.println(product);  
        }
    }
}
