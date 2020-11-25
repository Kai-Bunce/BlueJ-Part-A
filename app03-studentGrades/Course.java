

/**
 * Shows course information   
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

    private int finalMark;
    private Grades finalGrade;
    
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String id,String title)
    {
        // initialise instance variables
        this.courseID = id;
        this.title = title;
        module1 = new Module(" Programming Concepts", "CO452");
        module2 = new Module(" Cyber Security", "CO453");
        module3 = new Module(" Website Development", "CO454");
        module4 = new Module(" Data Modeling", "CO455");
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
    
      public void addMark(int moduleNo, int mark)
    {
       if(moduleNo == 1)
       {
           module1.setMark(mark);
       }
       else if (moduleNo == 2)
       {
           module2.setMark(mark);
       }
       else if (moduleNo == 3)
       {
           module3.setMark(mark);
       }
       else if (moduleNo == 4)
       {
           module4.setMark(mark);
       }
       else 
       {
           System.out.println("Invalid module number");
       }
    }
    public void calculateMeanMark()
    {
        int total = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        finalMark = total /4;
        char grade = calculateGrade(finalMark);
        System.out.println("Final mark = " + finalMark + "Final grade = " + grade);
    }
    
    public char calculateGrade(int mark)
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