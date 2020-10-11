
/**
 * Define a course      
 *
 * @author Kai Bunce
 * @version 1.0
 */
public class Course
{
    // instance variables 
    private String codeNumber;
    private String title;

    /**
     * Constructor for objects of class Course
     */
    public Course(String newTitle,String newCodeNumber)
    {
        // initialise instance variables
        title = newTitle; 
        codeNumber = newCodeNumber;
    }

    /**
     * Returns the courses code number
     *
     * 
     * @return   the code number
     */
    public String getCodeNumber()
    {
        return codeNumber; 
    }  
    
    /**
     * Returns the courses title
     *
     * @return the courses title
     */
    public String getTitle()
    {
        return title; 
    }
}
