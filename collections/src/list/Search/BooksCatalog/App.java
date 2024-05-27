package list.Search.BooksCatalog;

public class App {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        System.out.println("Books in catalog: " + catalog.showBooks());

        catalog.addBook("Stars", "John Green", 2020);
        catalog.addBook("Blue", "Rio", 2015);
        catalog.addBook("Car", "Mercedes", 2016);

        System.out.println("All books: " + catalog.showBooks());

        System.out.println("Filter books by title: " + catalog.searchByTitle("Stars"));

        System.out.println("Filter books by author: " + catalog.searchByAuthor("John Green"));

        System.out.println("Filter books by year interval: " + catalog.searchByYears(2014, 2016));
    }
}
