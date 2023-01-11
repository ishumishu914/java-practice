import businessLogic.*;

public class Runner 
{
    public static void main(String[] args) 
    {
        Menu menu = new Menu(5);
        menu.addMenu("Add a book");
        menu.addMenu("Remove a book");
        menu.addMenu("Update a book");
        menu.addMenu("Show cart items");
        menu.addMenu("Exit");
        Interface list = new ItemList();

        int choice;
        boolean stop = false;
        do {
            choice = menu.userSelection();
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.remove();
                case 3:
                    list.update();
                case 4:
                        list.print();
                case 5:
                    stop = true;
                    break;
                default:
                    System.err.println("Invalid option");
            }
        } while (!stop);
    }    
}
