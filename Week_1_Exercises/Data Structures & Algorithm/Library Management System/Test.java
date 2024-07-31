package librarymanagementsystem;

public class Test {

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.addBook(new Book(1, "Java Programming", "John Doe"));
        manager.addBook(new Book(2, "Data Structures", "Jane Smith"));
        manager.addBook(new Book(3, "Algorithms", "Emily Johnson"));
        manager.addBook(new Book(4, "Database Systems", "Michael Brown"));

        System.out.println("Searching for book 'Data Structures' using linear search:");
        Book book = manager.searchBookByTitleLinear("Data Structures");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

        manager.sortBooksByTitle();

        System.out.println("\nSearching for book 'Algorithms' using binary search:");
        book = manager.searchBookByTitleBinary("Algorithms");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
