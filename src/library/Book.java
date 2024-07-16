package library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public boolean getAvailability() {
        return availableCopies > 0;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnBook() {
        availableCopies++;
    }

    // Getters and Setters
}

