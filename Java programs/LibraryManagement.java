abstract class LibraryItem {
    private String title;
    private String author;
    private int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void displayDetails();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Published Year: " + getYear());
        System.out.println("Number of Pages: " + pages);
    }
}

class Journal extends LibraryItem {
    private String category;

    public Journal(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("Journal Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Published Year: " + getYear());
        System.out.println("Category: " + category);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 2020, 500);
        book.displayDetails();

        System.out.println();

        Journal journal = new Journal("Scientific Research", "Jane Smith", 2022, "Science");
        journal.displayDetails();
    }
}
