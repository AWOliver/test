public class Book {

    String bname;
    Author author;
    double price;
    int qty = 0;

    public Book(String bname, Author author, double price){
        this.bname = bname;
        this.author = author;
        this.price = price;
    }


    public Book(String bname, Author author, double price, int qty){
        this.bname = bname;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public void Print(){


    }

    public String getName(){
        return bname;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + bname + ", Author[name=" + author.name + ", email=" + author.email + ", gender=" + author.gender + ", price=" + price + ", qty=" + qty;
    }
}


