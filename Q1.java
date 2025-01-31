class Product {
    // Attributes
    int id;
    String name;
    double price;

    // Constructor to initialize the Product object
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display the product details
    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
        System.out.println("---------------------------");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Creating multiple Product objects
        Product product1 = new Product(101, "Laptop", 799.99);
        Product product2 = new Product(102, "Smartphone", 499.99);
        Product product3 = new Product(103, "Headphones", 129.99);

        // Displaying the details of each product
        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
    }
}
