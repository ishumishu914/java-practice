import java.util.Random;
import java.util.Scanner;

public class Student 
{
    private String fname;
    private String lname;
    private int year;
    private String ID;
    private String courses;
    private int tuitionBalance;
    private static int courseCost = 1000;

    //constructor - student name & year
    public Student() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.fname = in.nextLine();
        
        System.out.println("Enter last name: ");
        this.lname = in.nextLine();

        System.out.println("Enter year level: (e.g. 1 - first year)");
        this.year = in.nextInt();
        setID();
    }
    //create DI
    private void setID() 
    {
        Random random = new Random();
        this.ID = year+""+ random.nextInt(10000);    
    }
    //course enrollment
    public void enrollment() 
    {
        //show category of courses

        // with a loop select courses
        System.out.println("Enter course code to enroll (q/Q to quit): ");
        try (Scanner in = new Scanner(System.in)) {
            String course = in.nextLine();
            do {
            if (!course.equals("q") || !course.equals("Q")) {
                courses = courses + "\n" + course; //list of selectted courses
                tuitionBalance += courseCost;
            }
            else{ break;}            
            } while (true);
        }
        System.out.println("Enrolled in: " + courses);
    }
    //view balance
    public void ViewBalance() 
    {
        System.out.println("Current balance: $"+tuitionBalance);
    }
    //pay tuition
    public void PayTuition() 
    {
        ViewBalance();
        System.out.println("Enter tuion payment: $");
        try (Scanner in = new Scanner(System.in)) {
            int payment = in.nextInt();
            tuitionBalance -= payment;
        }
        ViewBalance();
    }
    //status
    public String status() 
    {
        return "Name: " +fname+ " "+ lname+ 
        "\nStudent ID: "+ ID +
        "\nYear level: "+ year+
        "\nEnrolled courses: "+courses+
        "\nBalance: $"+tuitionBalance;    
    }

}