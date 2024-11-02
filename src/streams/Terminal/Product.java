package streams.Terminal;

//Note-class coupled with ProductMain

class Product {
    private String name;
    private double price;

    
    // Constructor to initialize the Product object

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

 // Getter for name
    public String getName() {
        return name;
    }

 // Getter for price
    public double getPrice() {
        return price;
    }
}
