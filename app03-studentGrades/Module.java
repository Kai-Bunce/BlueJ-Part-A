
/**
 * A class holding and displaying information on modules
 *
 * @author Kai Bunce
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }

    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
           this.mark = mark; 
        }
        else
        {
           System.out.print("invalid mark");
        }
    }
    public void print()
    {
        System.out.println("Module: " + codeNo +
            "" + title + " Mark = " + mark);
    }
    
    public int getMark()
    {
         return mark;   
    }
    
      public char calculateGrade()
    {
	   
	   char grade;
	   
	   if (mark >= 70) {
		   grade = 'A';
	   }
	   else if (mark >=69) {
		   grade = 'B';  
	   }
	   else if (mark >=59) {
		   grade = 'C';
	   }
	   else if (mark >=49) {
		   grade = 'D';
	   }
	   else {
		   grade = 'F';
	   }
	   
	   System.out.println("the grade is" + grade);
	   return grade;
   }
}
