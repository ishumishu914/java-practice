import java.util.Scanner;

public class EmailApp 
{
    public static void main(String[] args) 
    {;
        Email email = new Email("Ishrat", "Sikder");
        System.out.println(email);

        /*System.out.print("\nTo change password press 1, to set an alternate email press 2: ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.close();
        if (option == 1) 
        {*/
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("Enter new password: ");
        //String newpassword = input.nextLine();
        //email.changePassword(newpassword);
        email.changePassword("hBu78Y06");       
        System.out.println("Your new password is: " + email.getPassword());



        /*}
        else if (option == 2) 
        {*/ 
        /*System.out.print("Enter alternate email: ");*/

        email.setAltEmail("ishrat.zaman@gmail.com");
        System.out.println("Your alternate email is: " + email.getAlternateEmail());
          
        /*in.close();
        }
        else 
        {
            System.out.print("Invalid choice! Enter again: ");
            //choice = in.nextInt();
        }*/
    }    
}