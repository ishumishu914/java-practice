import java.util.Scanner;

public class Menu 
{
    private String[] items;
    private int count=0;
    
    public Menu(int s)
    {
        items = new String[s];
    }

    public void addMenu(String item) 
    {
        if (count < items.length) {
            items[count++] = item;
        }    
    }

    public int userSelection() 
    {
        int choice =0;
        if (count>0) {
            for (int i = 0; i < items.length-1; i++) {
                System.out.println((i+1)+" - "+items[i]);
            }
            System.out.println("\nWhat would you like to do? ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            in.close();
        }  
        return choice;  
    }
}
