package net.hyalos.namaco.iterator;

/**
 * User: T.Ebina
 * Date: 2013/02/23
 * Time: 0:24
 */
public class Main {
    public static void main(String... args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("The Mythical Man-Month: Essays on Software Engineering"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
