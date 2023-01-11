import java.util.Scanner;

/**
 * Email
 */
public class Email 
{
    private String fName;
    private String lName;
    private String department;
    private String password;
    private int mailboxcap;
    private String alternateEmail;

    //constructor
    public Email(String fName, String lName) 
    {
        this.fName = fName;
        this.lName = lName;
        
        //determine department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //determine password
        /*System.out.print("Enter your desired password length (must be minimum 6): ");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.close();*/
        this.password = randomPassword(8);
        System.out.println("Your password is: " + this.password);

        //mailbox capacity
        setMailboxCapacity(500);
        this.mailboxcap = getMailboxCapacity();
    }
    
    //set department
    public String setDepartment()
    {
        System.out.print("Enter the department:\n1 for Sales\t2 for Development\t3 for Accounting\t4 for none:  ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        in.close();
        if (choice == 1) {return "sales";}
        else if (choice == 2) {return "development";}       
        else if (choice == 3) {return "accounting";}
        else {return "";}
    }

    public String randomPassword(int length)
    {
        String pwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) 
        {
            int index = (int)(pwSet.length() * Math.random());
            sb.append(pwSet.charAt(index));    
        }
        return sb.toString();
    }

    public void changePassword(String newPassword)
    {
        this.password = newPassword;
    }

    public void setMailboxCapacity(int capacity)
    {
        this.mailboxcap = capacity;
    }

    public void setAltEmail(String altEmail)
    {
        this.alternateEmail = altEmail; 
    }

    public String getPassword()
    {
        return password;
    }

    public int getMailboxCapacity()
    {
        return mailboxcap;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String toString()
    {
        String str = "Name: " + this.fName + " " + this.lName +
                    "\nYour email is: " + this.fName.toLowerCase() + "." + this.lName.toLowerCase() + "@" + this.department + ".TYProduction.com" +
                    "\nYour mailbox capacity is " + this.mailboxcap + " MB";
        return str;
    }

}