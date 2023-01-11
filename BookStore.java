package businessModel;

public class BookStore 
{
    private String ISBN; //product_num;
    private double price;
    private int publishYear;
    //private int stock;
    //private String author;

    /*public String getProduct_num() 
    {
        return this.product_num;
    }

    public void setProduct_num(String product_num) 
    {
        this.product_num = product_num;
    }*/

    public double getPrice() 
    {
        return this.price;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

}