package org.example.Mokito.TestDubble.dummy;

import org.example.Dummy.Book;
import org.example.Dummy.BookRepository;

import java.util.Collection;
import java.util.HashMap;

public class FakeBookRepository implements BookRepository {

    //in meory database , hashmap , list
    HashMap<String , Book> bookstore = new HashMap<>();


    @Override
    public void save(org.example.Dummy.Book book) {
        bookstore.put(book.getBookid(), book);
    }

    @Override
    public Collection<org.example.Dummy.Book> findallBooks() {
        return bookstore.values();
    }
}
