package net.hyalos.namaco.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * User: T.Ebina
 * Date: 2013/02/22
 * Time: 22:50
 */
public class BookShelf implements Aggregate {
    private List<Book> bookList;
    private int last = 0;

    public BookShelf(int initialSize) {
        this.bookList = new ArrayList(initialSize);
    }
    public Book getBookAt(int index){
        return bookList.get(index);
    }

    public void appendBook(Book book) {
        bookList.add(book);
    }

    public int getLength() {
        return bookList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
