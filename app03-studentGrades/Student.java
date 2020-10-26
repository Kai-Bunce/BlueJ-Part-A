import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Kai Bunce
 * @version 2016.02.29
 */
public class Student
{
    // the student's full name
    private String fullName;
    // the student ID
    private int id;
    // the amount of credits for study taken so far
    private int credits;
    // the students course
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, int studentID)
    {
        this.fullName = fullName;
        id = studentID;
    }

    /**
     * Return the full name of this student.
     */
    public String getFullName()
    {
        return fullName;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        fullName = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public int getStudentID()
    {
         return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints; //Shorthand for: credits = credits + additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     * Return the course.
     */
    public Course getCourse()
    {
        return course;   
    }
    
     public void addCourse (Course newCourse)
    {
        course = newCourse;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(fullName + ", student ID: " + id + ", credits: " + credits);
    }
    
    
}
