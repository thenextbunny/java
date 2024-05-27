package list.Search.BooksCatalog;

public class Book {
    private String title, author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return STR."\{title} by the author \{author} published in \{year}";
    }
}
