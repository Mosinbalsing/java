class Author {
    private String name;
    private String email;

    // Constructor to initialize the Author object
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter for the author's name
    public String getName() {
        return name;
    }

    // Getter for the author's email
    public String getEmail() {
        return email;
    }

    // Method to display author details
    public void displayAuthorDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
    }
}

class Book {
    private String title;
    private double price;
    private Author author; // Reference to an Author object

    // Constructor to initialize the Book object
    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Method to display book details along with author details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: $" + price);
        System.out.println("Book Author Details:");
        author.displayAuthorDetails(); // Call the method to display author details
        System.out.println("---------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create an Author object
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com");

        // Create Book objects with a reference to the Author object
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 29.99, author1);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", 24.99, author1);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
