public class Product {
    private String name = " ";
    private double price = 0.00;
    private String category = " ";
    private int quantity = 0;
    private char size =' ';
    private String author = " ";
    private String color = " ";
    // apparel constructor
    public Product (String name, double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }
    //Book Constructor
    public Product (String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }
    //Bath Constructor
    public Product ( String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }
    public boolean buy ( ) {
        if(this.quantity >0) {
            this.quantity -= 1;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString () {

        String str = new String();

        str = "Name:"+ this.name + '\n' + "Price:" + this.price + '\n' + "Quantity:" + this.quantity +'\n' + "author:" +
                this.author + '\n' + "color:" + this.color + '\n'+ "Category:" + this.category + "size:"+ this.size;

        return str; } }




