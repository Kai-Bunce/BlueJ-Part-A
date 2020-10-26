
/**
 * Define a course      
 *
 * @author Kai Bunce
 * @version 1.0
 */
public class Course
{
    // instance variables 
    private String courseID;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String id,String title)
    {
        // initialise instance variables
        this.courseID = id;
        this.title = title;
    }

     public void addModule (Module newModule)
    {
        module1 = newModule;
    }
    
    public void addModule(Module module, int moduleNo)
    {
       if(moduleNo == 1)
       {
           module1 = module;
       }
       else if (moduleNo == 2)
       {
           module2 = module;
       }
       else if (moduleNo == 3)
       {
           module3 = module;
       }
       else if (moduleNo == 4)
       {
           module4 = module;
       }
       else 
       {
           System.out.println("Invalid module number");
       }
        
       
    }  
  
}