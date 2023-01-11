package businessLogic;

import java.util.Scanner;

import businessModel.BookStore;

public class ItemList implements Interface
{
    private int count = 0;
    private final int MAX = 50;
    private BookStore[] list = null;


    public ItemList() 
    {
        list = new BookStore[MAX];
    }

    public int searchBook(String isbn)
    {
        for (int i = 0; i < count; i++) 
        {
            if (isbn.equals(list[i].getISBN())) 
            {
                return i;
            }    
        }
        return -1;
    }

    public void add() 
    {
        if (count == list.length) 
        {
            System.err.println("List is full!");    
        }    
        else
        {
            String isbn ;
            double price = 0;
            int publishYear = 0, productNum = 0;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter book ISBN: ");
            isbn = in.nextLine().trim();
            System.out.println("Enter published year: ");
            publishYear = in.nextInt(productNum);
            while (publishYear <= 1900 || publishYear >= 2023) {
                System.err.println("Invalid year please re-enter");
                publishYear = in.nextInt();
            }
            System.out.println("Enter quantity: ");
            productNum = in.nextInt();
            System.out.println("Enter price: ");
            price = in.nextDouble();
            in.close();

            BookStore b = new BookStore();
            b.setISBN(isbn);
            b.setPrice(price);
            b.setPublishYear(publishYear);
            list[count++] = b;
            System.out.println("New book added to cart");
        }
    }
    public void remove() 
    {
        String rmvisbn;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter book ISBN to be removed: ");
        rmvisbn = in.nextLine().trim();
        int found = searchBook(rmvisbn);
        while (found < 0) {
            System.err.println("Book not available to cart! Please try again");
            System.out.println("Enter book ISBN to be removed: ");
            rmvisbn = in.nextLine().trim();
        }
        in.close();
        if (found > 0 ) 
        {
            for (int i = found; i < count-1; i++) {
                list[i] = list[i+1];
            }
            count--;
            System.out.println("Book removed");
        }
    }    

    public void update() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter book ISBN to update: ");
        String isbn = in.nextLine();
        int found = searchBook(isbn);
        while (found < 0) {
            System.err.println("Book not available to cart! Please try again");
            System.out.println("Enter book ISBN to be updated: ");
            isbn = in.nextLine().trim();
        }
        in.close();
        if (found > 0 ) 
        {
            System.out.println("Enter new price: ");
            double price = in.nextDouble();
            System.out.println("Enter new publish year: ");
            int year = in.nextInt();
            while (year < 1900 || year > 2023) {
                System.err.println("Invalid year please try again: ");
                year = in.nextInt();
            }
            list[found].setPrice(price);
            list[found].setPublishYear(year);
            System.out.println("Book updated");
        }
    }

    public void print() 
    {
        if (count==0) {
            System.err.println("No books in cart");
        }    
        System.out.println("BOOK LIST: ");
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }

}
