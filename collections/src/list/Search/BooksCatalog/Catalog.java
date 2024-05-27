package list.Search.BooksCatalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(String name, String author, int year) {
        books.add(new Book(name, author, year));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> filteredBooksByAuthor = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                filteredBooksByAuthor.add(book);
            }
        }

        return filteredBooksByAuthor;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> filteredBooksByTitle = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                filteredBooksByTitle.add(book);
            }
        }

        return filteredBooksByTitle;
    }
    public List<Book> searchByYears(int initialYear, int endYear) {
        List<Book> filteredBooksByYears = new ArrayList<>();
        
        for (Book book : books) {
            if (book.getYear() >= initialYear && book.getYear() <= endYear) {
                filteredBooksByYears.add(book);
            }
        }

        return filteredBooksByYears;
    }

    public List<Book> showBooks() {
       return books;
    }
}
