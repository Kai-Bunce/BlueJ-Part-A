
/**
 * Define a course      
 *
 * @author Kai Bunce
 * @version 1.0
 */
public class Course
{
    // instance variables 
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo,String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
    }

    
    public void addModule(Module module, int moduleNo)
    {
       
    }  
    
    /**
     * Prints out the details of a course
     */
  
}
