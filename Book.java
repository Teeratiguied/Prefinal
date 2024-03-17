public class Book {
    private String name;
    private double price;
    private String type;
    
    // Default Constructor
    public Book() {
        this.name = "";
        this.price = 0.0;
        this.type = "";
    }

    // Parameterized Constructor
    public Book(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
