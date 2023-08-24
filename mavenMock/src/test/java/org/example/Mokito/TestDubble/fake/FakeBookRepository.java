package org.example.Mokito.TestDubble.fake;

import org.example.Mokito.TestDubble.fake.Book;
import org.example.Mokito.TestDubble.fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;

public class FakeBookRepository implements BookRepository {

    //in meory database , hashmap , list
    HashMap<String , Book> bookstore = new HashMap<>();



    @Override
    public void save(Book book) {
          bookstore.put(book.getBookid(),book);
    }

    @Override
    public Collection<Book> findallBooks() {
        return bookstore.values();
    }
}
