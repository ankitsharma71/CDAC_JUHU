import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business logic methods
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine();

        System.out.print("Enter the publisher's name: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter the ISBN number: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter the publication year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the price: $");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        Book book1 = new Book(title, author, publisher, isbn, year, price, quantity);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Publisher: " + book1.getPublisher());
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Quantity: " + book1.getQuantity());
        System.out.println("Inventory Value: $" + book1.getInventoryValue());

        book1.increaseQuantity(20);
        System.out.println("New Quantity: " + book1.getQuantity());
        System.out.println("New Inventory Value: $" + book1.getInventoryValue());

        book1.decreaseQuantity(15);
        System.out.println("New Quantity: " + book1.getQuantity());
        System.out.println("New Inventory Value: $" + book1.getInventoryValue());
    }
}